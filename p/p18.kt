import java.io.File

fun main(args: Array<String>) {
    /* Game.play()
    println(Pre.load()) */
    val (experience, level) = Ope(1, 2)
    println("$experience $level")
    val (x, y) = Coord(1, 0)
    println("$x $y")
    Direction.EAST.updateCoord(Coord(1, 0))
    println(Direction.EAST)
}

object Game { //インスタンスが生成できるのは一つまで
    init {
        println("Welcome")
    }

    public fun play() {
        while (true) {
            print("> Enter your command: ")
            println(GameInput(readLine()).processCommand())
        }
    }

    private class GameInput(arg: String?) {
        private val input = arg ?: ""
        val command = this.input.split(" ")[0]
        val argument = this.input.split(" ").getOrElse(1, { "" })

        public fun processCommand() = when (this.command.toLowerCase()) {
            else -> this.commandNotFound()
        }

        private fun commandNotFound() = "I'm not quite sure what your're trying to do!"
    }
}

data class Coord(val x: Int, val y: Int) { //データ格納に特化したデータクラス
    val isInBounds = x >= 0 && y >= 0

    operator fun plus(other: Coord) = Coord(x + other.x, y + other.y)
}

class Ope (val experience: Int, val level: Int) {
    operator fun component1() = experience
    operator fun component2() = level
}

class Pre {
    companion object {
        private const val MAP = "test.txt"

        public fun load() = File(MAP).readBytes()
    }
}

enum class Direction(private val coord: Coord) {
    NORTH(Coord(0, -1)),
    EAST(Coord(1, 0)),
    SOUTH(Coord(0, 1)),
    WEST(Coord(-1, 0));

    fun updateCoord(playerCoord: Coord) = coord + playerCoord
}

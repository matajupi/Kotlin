class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
    println(demo)
    var a = Direction.NORTH
    var b = Direction.WEST
    println(a == b)
}

interface Fightable {
    var health: Int
    val count: Int
    val side: Int
        get() = (0 until 10).shuffled().first()

    fun attack(oppo: String): Int
}

abstract class Monster(override var health: Int) : Fightable {
    public override fun attack(oppo: String): Int {
        if (oppo.length < 5) return (1..5).shuffled().last()
        else return -1
    }
}

class Player(override var health: Int = 100) : Fightable {
    public override val count: Int = 3

    public override val side: Int = 6

    public override fun attack(oppo: String): Int {
        if (oppo.length < 10) {
            return (1..10).shuffled().first()
        } else {
            return 1000
        }
    }
}

class Goblin(health: Int = 30) : Monster(health) {
    override val count = 2
    override val side = 10
}

fun main(args: Array<String>) {
    var player = Player()
    println(player.attack("jfoajfjlajfdkalfjal"))

    var goblin = Goblin()
    println(goblin.attack("jojojojojo"))
}

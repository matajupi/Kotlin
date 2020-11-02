open class Room(val name: String) {
    protected open val danger = 5

    public fun description() = "Room ${this.name}\nDanger ${this.danger}"

    public open fun load() = "Nothing much to see here"
}

open class TownSquare : Room("TownSquare") {
    protected override val danger = super.danger - 3
    private var bell = "GWONG"
    public var ownname = "Kosuke"

    public final override fun load() = "The village\nbell ${this.ring()}"

    private fun ring() = "The bell ${this.bell}"
}

/* fun main(args: Array<String>) {
    var curret = Room("Foyer")
    println(curret.description())
    println(curret.load())

    var curret1: Room = TownSquare()
    println(curret1.description())
    println(curret1.load())

    println()

    println("curret is Room: ${curret is Room}")
    println("curret is TownSquare: ${curret is TownSquare}")
    println("curret1 is Room: ${curret1 is Room}")
    println("curret1 is TownSquare: ${curret1 is TownSquare}")

    println()

    printIs(curret)
    printIs(curret1)
} */

fun main(args: Array<String>) {
    var aba = object : Room("non") { //オブジェクト式
        override fun load() = "You anti"
    }

    println(aba.load())
}

fun printIs(any: Any) {
    val isSource = if (any is TownSquare) {
        any.ownname == "Kosuke"
    } else {
        "Nothing" in (any as Room).load()
    }
    println("$any is a source of $isSource")
}

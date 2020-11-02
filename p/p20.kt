class LootBox<T : Loot>(vararg item: T) { //Tは完全固定でLootではなく派生クラスが入れば派生クラスの型となる
    public var open = false
    private var loot: Array<out T> = item

    operator fun get(index: Int): T? = loot[index].takeIf { this.open } //lootBoxに対する[]の定義

    public fun fetch(item: Int): T? {
        return this.loot[item].takeIf { this.open }
    }

    public fun <R> fetch(item: Int, lootModFunction: (T) -> R): R? { //関数を渡し別の型を返す関数
        return lootModFunction(this.loot[item]).takeIf { this.open }
    }
}

class Barrel<out T>(public val item: T)

open class Loot(public val value: Int)

class Fedora(public val name: String, value: Int) : Loot(value)

class Coin(value: Int) : Loot(value)

inline fun <reified T> randomOrBackupLoot(backupLoot: () -> T): T {
    val items = listOf(Coin(14), Fedora("a fed", 150))
    val randomLoot: Loot = items.shuffled().first()
    return if (randomLoot is T) { //型消去（型情報が実行時に使えない）されるためエラー　→　reifiedキーワードにしてinline化する
        randomLoot
    } else {
        backupLoot()
    }
}

fun main(args: Array<String>) {
    /* val lootBoxOne: LootBox<Fedora> = LootBox(Fedora("a generic-looking", 15), Fedora("a jazz bar", 25))
    val lootBoxTwo: LootBox<Coin> = LootBox(Coin(15))

    lootBoxOne.open = true
    lootBoxOne.fetch(1)?.run {
        println("Your $name from box")
    }

    val coin = lootBoxOne.fetch(0) {
        Coin(it.value * 3)
    }
    coin?.let { println(it.value) }

    var fedora = lootBoxOne[1]
    fedora?.let { println(it.name) } */

    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("a generic", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))

    /* lootBarrel = fedoraBarrel //fedoraBarrelに入るのはFedora型のみである。しかしlootBarrelにはLoot型の仕様になる
    lootBarrel.item = Coin(15) //ここのポインタはfedoraBarrelを指している。しかしLoot型の仕様になっているためキャストにより代入が可能。
    val myFedora: Fedora = fedoraBarrel.item //fedoraBarrelはFedora型であるはずだが、上でCoin型に変えられてしまう事態がおこる */

    //out修飾子がついているため読みだし専用 Listもout
    lootBarrel = fedoraBarrel
    val myFedora: Fedora = fedoraBarrel.item
    println(myFedora == lootBarrel.item)

    randomOrBackupLoot {
        Fedora("a backup", 15)
    }.run {
        println(name)
    }
}

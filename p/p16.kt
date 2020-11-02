import mypack.player.*

fun main(args: Array<String>) {
    var player = Player("kosuke", 100) //インスタンス生成
    player.castFireball()
    println(player.name)
    /* player.name = "  Kosuke      "
    println(player.name) */
    var myd = Dice()

    for (i in (0 until 6)) {
        println(myd.rolledValue)
    }
    var player2 = Player("Ker") //セカンダリコンストラクタで生成
    println(player2.name)
    println(player2.health)
}

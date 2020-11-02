private const val MAX_NUM: Int = 200

fun main(args: Array<String>) {
    /* val num = readLine()!!.toInt()
    println("Hello world")
    val isTrue = when(readLine()!!.toInt()) {
        0 -> false
        else -> true
    } */
    //変数宣言をしてみる
    val num: Int
    num = readLine()!!.toInt()

    println("This ${format(num, true)} that I bought it")
    println(MAX_NUM)
}

//アクセス修飾子（可視性修飾子）が使える
//初期化　initialize
fun format(health: Int, isBleed: Boolean): String {
    val healthS = when (health) {
        100 -> "is 100"
        in 99 downTo 50 -> "is in 99"
        in 49 downTo 0 -> if (isBleed) "is in full" else "is in 49"
        else -> "What are you talking about"
    }

    return healthS
}

fun main(args: Array<String>) {
    /* for (i in 0..10) {
        cast()
    } */
    /* for (i in 0 until 10) {
        cast()
    } */
    println(call2(3, true))
    println(call2(isin = true, num = readLine()!!.toInt())) //名前付き引数で値を渡してみる
    //上の機能は関数のヘッドと同じ変数名に代入する、順不同
}
private fun cast() { //戻り値がない関数をUnit関数と呼ぶ
     println("Hello world")
}
private fun call(num: Int = 5) { //デフォルト引数を入れている
    for (i in 0 until num) {
        println("Call someone")
    }
}

//単一式関数
private fun call2(num: Int, isin: Boolean) =
when(num) {
    3 -> "is in the book"
    in 4..10 -> "is in the ship"
    in 11..20 -> "is in the plane"
    else -> if (isin) "fast" else "None"
}

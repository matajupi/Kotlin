import kotlin.math.roundToInt //importで呼び出す

fun main(args: Array<String>) {
    //文字列を数値型に変換
    //toFloat, toDouble, toDoubleOrNull, toInt
    //toIntOrNull, toLong, toBigDecimal
    /* val gold: Int = "5.91".toIntOrNull() ?: 0
    println(gold) */

    //IntからDoubleもtoDoubleで
    //IntとDoubleの計算ではDoubleになる
    /* val interger: Int = 4
    val dou: Double = interger.toDouble()
    println(dou + 0.1) */

    val output = 10.1 - 5.91
    //フォーマと指定子によって切り上げになっている
    /* println("A: ${"%.2f".format(output)}") */


    //少数どおしはできるだけ計算してから丸める（精度のために）
    val numb = output.toInt()
    println(numb)

    val numa = output.roundToInt()
    println(numa)

    //剰余演算子のことをモジュロ演算子ともいう
}

import kotlin.math.roundToInt

const val T_NAME = "Tea"

fun main(args: Array<String>) {
    val patronList = listOf("Eli", "Mordoc", "kosuke") //イミュータブルで書き換えが不可能なリスト（配列みたいな）
    /* println(patronList[0])
    println(patronList.first())
    println(patronList.last())
    var ans = patronList.getOrElse(4) { "Unknown" }
    println(ans)
    ans = patronList.getOrNull(4) ?: "Unknown"
    println(ans) */

    if (patronList.contains("kosuke")) {
        println("Hello kosuke")
    } else {
        println("Im sad because he didnt come")
    }

    if (patronList.containsAll(listOf("Eli", "kosuke"))) {
        println("Hi welcome")
    } else {
        println("They dont come")
    }
}

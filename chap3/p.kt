fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val o = when (a) {
        == 3 ->  "${a} is 3"
        < 3 -> "${a} is very low"
        in 4 until 10 -> "${a} is in 9"
        in 10..99 -> "${a} is in 99"
        else -> "What are you talking about?"
    }
    println(o)
}

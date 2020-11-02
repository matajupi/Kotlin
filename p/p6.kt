fun main(args: Array<String>) {
    val l = listOf(3, 1, 3).first().let {
        it * it
    }
    println(l)

    println(format("hai"))
}

fun format(text: String?): String {
    return text?.let {
        text
    } ?: "null"
}

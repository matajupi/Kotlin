fun frame(name: String, padding: Int, formatChar: String = "*"): String {
    val greeting = "$name!"
    val middle = formatChar.padEnd(padding).plus(greeting).plus(formatChar.padStart(padding))
    var end: String = ""
    (0 until middle.length).forEach { end += formatChar }
    return "$end\n$middle\n$end"
}

fun String.forame(padding: Int, formatChar: String = "*"): String {
    val greeting = "$this!"
    val middle = formatChar.padEnd(padding).plus(greeting).plus(formatChar.padStart(padding))
    var end: String = ""
    (0 until middle.length).forEach { end += formatChar }
    return "$end\n$middle\n$end"
}

fun main(args: Array<String>) {
    print(frame("Welcome, Madrigal", 5))
    println()
    print("Welcome, Madrigal".forame(5))
}

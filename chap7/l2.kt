fun main(args: Array<String>) {
    /* println(toDs("ah, delectionus")) */
    val phe = if (readLine()!! === "fast") {
        "merge"
    } else {
        "medre"
    }
    println(phe)
}

//RegexはKotlinの正規表現
fun toDs(text: String) =
text.replace(Regex("[aeiou]")) {
    when (it.value) {
        "a" -> "4"
        "e" -> "3"
        "i" -> "1"
        "o" -> "0"
        "u" -> "|_|"
        else -> it.value
    }
}

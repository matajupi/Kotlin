fun main(args: Array<String>) {
    val grefun: (String) -> Boolean = {
        it.length > 10
    }
    println(isBigNumber("haha"))
    println("haha".run(::isBigNumber))
    println("haha".run {
        var size = length
        size * size
        })
    println("hahahahahahahhahha".run(grefun))
}

fun isBigNumber(text: String) = text.length

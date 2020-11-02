const val NAME = "Kosuke's bread"

fun main(args: Array<String>) {
    var data = "jaja,some,kyou"
    placeOrder(data)
}

fun placeOrder(data: String) {
    val indexOfA = NAME.indexOf('\'')
    val master = NAME.substring(0 until indexOfA)
    println(master)

    /* val dl = data.split(',') */
    val (type, name, price) = data.split(',')
    println("${type} no ${name} wa ${price}")
}

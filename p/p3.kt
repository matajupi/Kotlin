fun main(args: Array<String>) {
    var swj: Int? = null
    val isj = (1..3).shuffled().last() == 3
    if (isj) {
        swj = 2
    }

    try {
        proCheck(swj)
        swj!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }

    /* proCheck(swj)
    swj = swj!!.plus(1) */
    println("$swj")
}

fun proCheck(swj: Int?) {
    /* swj ?: throw UnkilledJugglerException() */
    checkNotNull(swj, { "Player cannot juggle" })
}

class UnkilledJugglerException() : IllegalStateException("Player wa doko ?")

fun <T, R> flipValues(mapValues: Map<T, R>) = mapValues.toList().map { pair ->
                                                Pair(pair.second, pair.first)
                                            }.toMap()

fun main(args: Array<String>) {
    val gra = mapOf("Josh" to 4, "Alex" to 2, "Jane" to 3)
    println(flipValues(gra))
}

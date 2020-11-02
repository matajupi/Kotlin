fun main(args: Array<String>) {
    val patron = mapOf("Eli" to 14, "Chomad" to 20, "kosuke" to 16) //Map<String, Int>
    println(patron)
    var patron2 = mapOf(Pair("Eli", 14), Pair("kosuke", 16)) //using Pair
    println(patron2)
    var patron3 = mutableMapOf("kosuke" to "futamata", "ch" to "ya") //MutableMap<String, Int>
    patron3.put("kosuke", "mata")
    println(patron3)

    println(patron3["kosuke"])
    println(patron3["ch"])

    patron3.forEach { key, value ->
        println(key)
        println(value)
    }
}

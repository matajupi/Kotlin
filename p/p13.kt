fun main(args: Array<String>) {
    for (i in (0 until 9)) {
        println(i)
    }

    (0 until 9).forEach {
        println(it)
    }

    //setOf, mutableSetOf
    val uni = mutableSetOf<String>()
    uni.add("hair")
    uni.add("Osi")
    uni.add("hair")
    println(uni)

    //listOf, mutableListOf
    val li = mutableListOf<String>()
    li.add("a")
    println(li)
}

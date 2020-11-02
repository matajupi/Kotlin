fun main(args: Array<String>) {
    //filter function

    val itemsOfColor = listOf(listOf("red apple", "green apple", "blue apple"), listOf("red fish", "blue fish"), listOf("yello banana", "teal banana"))
    val redItems = itemsOfColor.flatMap { it.filter { it.contains("red") } }
    println(redItems)

    //素数判定
    val nums = listOf(7, 4, 8, 4, 3, 22, 18, 11)
    val primes = nums.filter { number ->
        (2 until number).map { number % it }
            .none { it == 0 }
    }
    println(primes)
}

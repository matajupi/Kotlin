data class User(val name: String, val age: Int)


fun main(args: Array<String>) {
    val (e1, e2) = listOf(1, 2)
    println(e1)
    println(e2)

    val jack = User("jack", 1)
    val olderJack = jack.copy(age = 2)
    println(olderJack)

    val (name, age) = jack
    println("$name, $age, $jack")
}

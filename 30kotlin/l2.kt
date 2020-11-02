class Customer(name: String) {
    init {
        println(name)
    }

    val customerKey = name.toUpperCase()

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        println(firstName)
        println(lastName)
    }
}

class Person(val firstName: String, val lastName: String, var age: Int = 15) {

}

fun main(args: Array<String>) {
    var customer = Customer("Kosuke")
    var customer2 = Customer("Kosuke", "Futamata")
    var person = Person("Kosuke", "Futamata")
    person.age++
    println(person.age)
}

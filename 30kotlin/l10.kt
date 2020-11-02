interface IFoo {
    fun A(): String {
        println("Function A")
        return  "ERROR"
    }
}

fun main(args: Array<String>) {
    var foo = object : IFoo {
        val a = 100
        override fun A(): String {
            println("Function A no haseigata")
            return "INFO"
        }
    }

    println(foo.a)
    println(foo.A())
    printObj(foo)
}

fun printObj(obj: IFoo) {
    println(obj.A())
}

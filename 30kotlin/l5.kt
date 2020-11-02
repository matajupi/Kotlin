interface MyInterface {
    val property: Int
    val stringG: String
        get() = "foo"

    fun bar()
    fun foo() {
        println("Foo")
    }
}

class Child(prope: Int) : MyInterface {
    override val property: Int = prope

    override fun bar() {
        println("Bar")
    }

    override fun foo() {
        super.foo()
        println("This is ChildClass")
    }
}

fun main(args: Array<String>) {
    var ch = Child(15)
    ch.bar()
    ch.foo()
    println(ch.property)
    println(ch.stringG)
    var ab = Dev()
    ab.bar()
    ab.foo()
}

abstract class MyAbstract {
    abstract fun bar()
    abstract fun foo()
}

class Dev : MyAbstract() {
    override fun bar() {
        println("Bar")
    }

    override fun foo() {
        println("Foo")
        println("This is ChildClass")
    }
}

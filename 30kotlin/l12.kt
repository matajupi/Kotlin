interface Factory<T> {
    fun create(): T
}

class MyClass {
    /* companion object Factory { //able

    } */

    companion object : Factory<MyClass> { //like static method or property
        override fun create(): MyClass = MyClass()
    }

    override fun toString(): String {
        return "MyClass is Empty Object"
    }
}

class SubClass(_num: Int) {
    var num = _num
    companion object : Factory<SubClass> {
        override fun create(): SubClass = SubClass(100)
    }

    override fun toString(): String {
        return "SubClass has ${this.num}"
    }
}

fun main(args: Array<String>) {
    val instance = MyClass.create()
    println(instance)
    println()
    val subinstance = SubClass.create()
    println(subinstance)
    println()
    var x = SubClass.Companion
    println(x.create())
}

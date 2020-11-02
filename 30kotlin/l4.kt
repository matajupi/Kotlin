open class MyClass {
    var initialized = 1

    val sR: String
        get() {
            return this.toString()
        }

    var setterV: String = "abc"
        private set

    open var getset = 10
        set(value) {
            if (value >= 0) field = value
        }
}

class SomeonesClass : MyClass() {
    override var getset = 20
    set(value) {
        if (value < 0) field = value + 273
        else field = value
    }
}

fun main(args: Array<String>) {
    var mc = MyClass()
    println(mc.sR)
    println(mc.setterV)
    mc.getset = readLine()!!.toInt()
    println(mc.getset)

    var sc = SomeonesClass()
    sc.getset = readLine()?.toInt() ?: 0
    println(sc.getset)
}

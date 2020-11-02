open class Base(val p: Int) {
    open fun v() {
        println("Function v $p")
    }

    fun nv() {
        println("Function nv")
    }
}

class Derived(p: Int) : Base(p) {
    final override fun v() {
        super.v()
        println("But this is Next")
    }
}

abstract class Desb(p: Int) : Base(p) {
    override abstract fun v()
}

class Desa(p: Int) : Desb(p) {
    override fun v() {
        println("OK")
    }
}

open class V(var s: String, var a: Int = 0) {

}

class OV : V {
    constructor(s: String) : super(s) {
        println("OK")
    }

    constructor(s: String, a: Int) : super(s, a) {
        println("OK")
    }
}

fun main(args: Array<String>) {
    var derived = Derived(15)
    derived.v()
    derived.nv()
    var desa = Desa(18)
    desa.v()
    var ov = OV("Hello")
    var ov2 = OV("Hello", 23)
}

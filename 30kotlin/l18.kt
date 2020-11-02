interface IBase {
    fun A()
}

class De : IBase {
    override fun A() = println("FunctionADE")
}

class De2 : IBase {
    override fun A() = println("FunctionADE2")
}

fun <T> T.B()
where T : IBase, T : Any = println("FunctionB")

fun main(args: Array<String>) {
    var a: String = readLine() ?: ""
    var num: Int = 0
    try {
        num = a.toInt()
        if (num < 0) {
            num = -1
            throw IllegalArgumentException("name expected")
        }
    } catch (e: Exception) {
        num = -1
    } finally {
        println(num)
    }

    var de = De()
    var de2 = De2()
    var list: MutableList<IBase> = mutableListOf(de, de2)
    list.forEach {
        it.A()
        it.B()
    }
}

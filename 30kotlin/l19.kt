class Source<out T>(val item: T)

class Comparable<in T> {
    fun compareTo(other: T): Int {
        return other.toString().toInt()
    }
}

fun main(args: Array<String>) {
    var str = Source("text")
    println(str.item)
    var obj: Source<Any> = str
    println(obj.item)

    var x: Comparable<Any> = Comparable<Any>()
    println(x.compareTo(3))
    var y: Comparable<Int> = x
    println(y.compareTo(12))

    val ints = listOf(1, 2, 3)
    val nums: List<*> = ints
    val a: Any? = nums.get(0)
    println(a)
}

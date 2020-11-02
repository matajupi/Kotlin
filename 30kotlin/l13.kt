const val SUBSYS = "This subsystem"

fun main(args: Array<String>) {
    println(SUBSYS)
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
    println(list getElement 2)
}

infix fun <T> MutableList<T>.getElement(index: Int): T? {
    try {
        return this[index]
    } catch(e: Exception) {
        return null
    }
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

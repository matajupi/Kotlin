fun double(x: Int) = x * 2

fun reformat(str: String = "Hello") = println(str)

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) result.add(t)
    return result
}

fun main(args: Array<String>) {
    /* println(double(3))
    reformat()
    reformat("Hello")
    var a = arrayOf("1", "2", "3")
    var al = asList("Hello", "How", *a, "are", "you")
    println(al) */

    //ネスト構造になっているときに指定の場所に移動
    //break, continue, returnなど
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == 3 && j == 2) { continue@loop }
            if (i == 100 || j == 100) { break@loop }
        }
    }
    hee()
}

fun hee() {
    var ints = listOf(1, 2, 3, 4, 5, 0)
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}

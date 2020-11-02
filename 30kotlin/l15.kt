fun main(args: Array<String>) {
    var list = mutableListOf("text", "name", "kosuke", "dare")
    var newlist = list.setUpData(::setter, ::setData)
    for (i in newlist) {
        println(i("text"))
    }
}

fun setter(d: String): (String) -> Int {
    return { text: String ->
        (text + d).length
    }
}

fun <T> setData(d: T, body: (T) -> ((T) -> Int)): (T) -> Int {
    return body(d)
}

fun <T, R, S> MutableList<T>.setUpData(d: (R) -> Int, body: (T, (R) -> ((R) -> Int)) -> S): MutableList<S> {
    var res: MutableList<S> = mutableListOf()
    for (i in this) {
        res.add(body(i, d))
    }
    return res
}

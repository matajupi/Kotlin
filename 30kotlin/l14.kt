fun main(args: Array<String>) {
    println(highF(13) {
        it.toString()
        })
    println(highF(15, ::testF))
    var lamda: (Int) -> String = { num ->
        "Who" + num.toString()
    }
    println(highF(15, lamda))
    println(15.highF2(18) { num1, num2 ->
        println(num1)
        (num1 + num2).toString() + "Who?"
        })
    var body1 = { ihsab: IHaveStringAndBoolean, num: Int ->
        println("BODY1")
        var isok = ihsab.isOK
        IHaveNumAndBoolean(num, isok)
    }

    var body2 = {  ihsab: IHaveStringAndBoolean, ihnab: IHaveNumAndBoolean ->
        println("BODY2")
        var num = ihsab.text.length + ihnab.num
        num
    }
    println(IHaveStringAndBoolean("Text", true).highF3(15, body1, body2))
}

data class IHaveNumAndBoolean(val num: Int, val isOK: Boolean)
data class IHaveStringAndBoolean(val text: String, val isOK: Boolean)

fun testF(num: Int): IHaveNumAndBoolean {
    return IHaveNumAndBoolean(num, true)
}

fun <T> highF(num: Int, body: (Int) -> T): T? {
    if (num > 20) return null
    return body(num)
}

fun <T, R> T.highF2(num: T, body: (T, T) -> R): R {
    return body(this, num)
}

fun <T, R, S> T.highF3(ele: R,
    body1: (T, R) -> S,
    body2: (T, S) -> R): R {
        var s = body1(this, ele)
        var res = body2(this, s)
        return res
    }

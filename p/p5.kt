//自作シーザー暗号プログラム


fun main(args: Array<String>) {
    var moji = readLine()!!
    var num = readLine()!!.toInt()
    while (num > 26) num -= 26

    /* println(toDoru(moji)) */
    var res = ""

    moji.forEach {
        var charmoji = it.toChar()
        charmoji += num
        if (charmoji > 'z') {
            charmoji -= 26
        }
        res += charmoji
    }
    println(res)
}

/* fun toDoru(phrase: String): String {
    //おそらくKotlinの正規表現はKotlinの一部ではなく標準ライブラリに付属しているため使用することができない
    println(doru)
    return doruaa
} */

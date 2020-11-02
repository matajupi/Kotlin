package com.p21

fun String.addEnt(amount: Int = 1) = this + "!".repeat(amount) //拡張メソッド(標準関数などもこれを利用)

//戻り値なし スーパークラスに対して実装 →　ジェネリック型に
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

//拡張プロパティ バッキングフィールドは持たない
val String.numVowels
    get() = count { "aeiouy".contains(it) }

//null許容型のエクステンション
infix fun String?.printWith(default: String) = println(this ?: default)

fun <T> Iterable<T>.random(): T = this.shuffled().first() //Iterableはコレクションのインターフェイス

fun main(args: Array<String>) {
    println("Madri".addEnt(10))
    "Kosuke".addEnt().easyPrint()
    42.easyPrint()
    "Ema".easyPrint().addEnt().easyPrint()
    "How many vowels?".numVowels.easyPrint()

    //infixなしまたはありの呼び出し方
    var pri: String? = null
    pri.printWith("default")
    pri = "insc"
    pri.printWith("default")

    //infixありの固有の呼び出し方（なんじゃこれ）
    pri = null
    pri printWith "default"
    pri = "infix"
    pri printWith "default"

    (1..3).random().easyPrint()
}

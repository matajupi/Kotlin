fun main(args: Array<String>) {
    println("Hello world")
    /* println(call())
    call3()
    call3(200) */
    call4()
    `call4`("heju")
    call4("jupi", false)
    `this is interesting 🌸 🚄 🚙`()
    val `your name is what?` = "newton"
    println(`your name is what?`)
}

//このような引用符はjavaのメソッドなどを使用するときに
//Kotlinの予約語と被っても使えるようにするためのもの
fun `this is interesting 🌸 🚄 🚙`() = println("www")

fun call2(): String {
    TODO("impressed")//TODOはNothing型を採用しており必ずエラーを返す
    //このように書きかけの関数などに使うと便利
    //println("Hello world")//このコードは到達不可というアラートが出る
}

fun call(): String {
    println("wa")
    return if (true) "Hello" else "world"
}

//関数が多重定義されている
fun call3(num: Int = 9) = println(num + 1)

//オーバーロードありの関数
fun call4() = println("Hey")
fun call4(param: String) = println(param)
fun call4(param: String, isok: Boolean) = if (isok) println(param)
else println("It is seacret")

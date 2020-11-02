fun main(args: Array<String>) {
    /* val name: String
    var health = 89

    if (health == 100) {
        println("your health is great")
    } else if (health > 50) {
        println("your health is good")
    } else {
        println("your health is bad")
    }
    println(name) */

    /* var st = if (true) {
        println("hello")
        "status"
    } else {
        "lock"
    }
    println(st) */

    /* println(3 in 1..5) */

    /* val faction = when (3) {
        1 -> "keep"
        2 -> "stop"
        in 3..6 -> "born"
        else -> "what"
    }

    println(faction) */

    /* val a = "hello"
    val b = "world"
    println("${if (true) a else b}") */

    //listに対してもinは使える

    println(function("hehe"))
    println(function("hehe", 5  ))
    println(function1("hello"))
    println(function2(moji = "hele")) //Kotlin.Unit
    println(function3())
}

private fun function(moji: String, num: Int = 3): String {
    return "$num $moji"
}

private fun function1(moji: String): String = when (moji) {
    "hello" -> "what"
    else -> "program"
}

private fun function2(moji: String): Unit = println(moji) //Unit関数

private fun function3(): String = TODO("now creating") //作りかけのときなどに使う(passのイメージ)

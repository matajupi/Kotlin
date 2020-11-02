fun main(args: Array<String>) {
    //ドット構文
    val str = "Mississippi"
    println(str.count())
    //sの数だけ数える(匿名関数使用)
    /* println(str.count({letter ->
        letter == 's'
        }))
    */
    //itを使った簡略的な書き方
    println(str.count({ it == 's' }))
    println(str.count { it == 's' })
    //無名関数における型推論
    /* val func = {
        println("Hello world, Im Ok!!!")
        "great person"
    } */
    //無名関数引数あり時の書き方
    val func = { player: String, num: Int ->
    println("I am great $player and I will pray for $num times")
    "great your "
    }
    println(func("matajupi", 500))
}

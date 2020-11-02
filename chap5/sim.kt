fun main(args: Array<String>) {
    /* println({val year = 2020
        "Welcome to sim in ${year}"
    }()) */
    //関数型は()を付けると実行される 付けないと関数型として渡される
    //引数なしのString型をリターンする関数型
    //returnは基本的に使用不可
    /* val grefunc: () -> String = {
        val year = 2020
        "Welcome to sim $year"
    }
    println(grefunc()) */

    /* val grefunc: (String) -> String = { playerName ->
        val year = 2020
        "Welcome to sim $playerName $year"
    } */
    //itキーワードを使ってみる(非推奨)
    /* val grefunc: (String) -> String = {
        val year = 2020
        "Welcome to $it $year"
    }
    println(grefunc("matajupi")) */

    /* val grefunc: (String, Int) -> String = { playerName, numBuilder ->
    val year = 2020
    println("adding $numBuilder")
    "Welcome to sim $playerName $year"
    }
    println(grefunc("matajupi", 2)) */

    //こんな謎記法も使えるらしいが私なら使いたくない
    //関数リファレンスを参照するときは::演算子の後ろに関数名を書く
    runSim("matajupi", ::printCC) { name: String, num: Int ->
    val year = 2020
    println("adding $num")
    "Welcome to sim $name $year"
    }
}

//inline化することで関数ごとにそれぞれのラムダの引数がインスタンス化されなくなるため
//メモリのオーバーヘッドをなくすことができる
//返り値ない関数の返り値はUnit型になる
inline fun runSim(name: String,
    costPrint: (Int) -> Unit,
    grefunc: (String, Int) -> String) {
    val num = (1..3).shuffled().last() //1から3をシャッフルして最後の値を取る
    costPrint(num)
    println(grefunc(name, num))
}

//返り値のないUnit型(この場合なくてもいい)
fun printCC(num: Int): Unit {
    val cost = 500
    println("cc: ${ cost * num }")
}

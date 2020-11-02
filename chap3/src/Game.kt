//main->tabでmain関数が自動的に作られる
fun main() {
//    val name = "Med "
//    var health = 8

//    if (health == 100) { //構造等価演算子
//        println(name + "is in excellent condition")
//    } else {
//        println(name + "is in awful condition")

//    if (health >= 15) {
//        println(name + "looks pretty hurt")
//    } else if (health >= 75) {
//        println(name + "has some minor wounds")
//    } else if (health == 100) {
//        println(name + "is in excellent condition")
//    } else {
//        println(name + "is in awful condition")
//    }

//    val nus = if (false) {
//        "Hu"
//    } else if (true) {
//        "Hk"
//    } else {
//        "Ji"
//    }
//
//    val num = if (false) 4
//    else if (false) 5
//    else if (true)
//        if (false) 6
//        else 8
//    else if (false) 9
//    else 10
//
//    println("Hello world")
//
//    println(num)
//
//    println(nus)

//    val health = 79
//    val healthPoint = if (health == 100) {
//        "is in excellent"
//    } else if (health in 90..99) {
//        "has a few scratches"
//    } else if (health in 75..89) {
//        "has some minor wounds"
//    } else if (health in 15..74) {
//        "looks pretty hurt"
//    } else {
//        "is in awful condition"
//    }
//
//    println(healthPoint)

//    val race = "gnome"
//    val faction = when (race) {
//        "dwarf" -> "Keepers of the Mines"
//        "gnome" -> "Keepers of the Mines"
//        "orc" -> "Free People of the Rolling Hills"
//        "human" -> "Free People of the Rolling Hills"
//        else -> null
//    }
//
//    println(faction)

    val healthPoint = 80
    val healthStatus = when (healthPoint) {
        100 -> "is in excellent"
        in 90..99 -> "has a few"
        in 75..89 -> {
            println("Hello world")
            if (healthPoint % 2 == 0) "Point"
            else "Oi"
        }
        in 15..74 -> "looks"
        else -> null
    }
    val name = "matajupi"
    println("$name is my $healthStatus")
    println("${name}hamy${if (healthStatus == "Point") {
    "Nomou"
    } 
    else {
        "Siranai"
    }
    }hawatasinomonoyo")

    //A downTo BはAからBまでを降順につくる。リスト化するときは()で囲んで.toList()
    //A until BはAからBー１までを昇順につくる。リスト化するときは()で囲んで.toList()
    //A..BはAからBまでを昇順に作る。リスト化するときは同じ方法
    //上記すべてはchar型に適用することも可能
    //toIntでInt型に変更
    //Math.pow(double, double)　まぁ分かるでしょう
    //Math.random() <- 1以下の少数を返す
    //[list]sum()で合計
}
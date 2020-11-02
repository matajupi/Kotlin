fun main(args: Array<String>) {
    //例外
    var sj: Int? = null
    val isjp = (1..3).shuffled().last() == 3
    if (isjp) {
        sj = 2
    }
    //try/catch文
    try {
        //例外を送出してみる
        profi(sj)
        sj = sj!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
    println("you $sj")
}

fun profi(sj: Int?) {
    /* sj ?: throw IllegalStateException("Player cannot") */
    /* sj ?: throw UnSkilledException() */
    checkNotNull(sj, { "player cannnot" })
    //checkNotNull もし引数がnullならIllegalStateExceptionを発令する
    //requireもし引数がnullなら上記の対応
    //requireNotNull, error, assert

}

//カスタム例外
class UnSkilledException() : IllegalStateException("Player cannot")

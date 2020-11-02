fun main(args: Array<String>) {
    /* var sd = "bottle"
    sd = null */
    //readLine関数は返り値がString?型　これはnull許容型
    //しかし、何も入力がなかったときは空文字列が代入される
    /* var bev = readLine().capitalize() //エラー */
    /* bev = null //null許容型なので可能 */

    //セーフコール演算子を使う
    //この演算子はnullだった時に呼び出しをスキップする
    //letにより後処理を追加できる isNotBlankは空文字列かどうか
    /* val bev = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "About blank"
        }
    } */

    //二重感嘆符演算子（非null表明演算子）を使う
    //普通は使うべきでない危険な演算子
    //もし、nullであれば例外がかえる
    /* val bev = readLine()!!.capitalize()
    println(bev) */

    //if文で愚直にチェックをする
    /* var bev = readLine() */
    /* bev = null */
    /* if (bev != null) {
        //スマートキャストにより二重感嘆符演算子が不要
        bev = bev.capitalize()
    } else {
        println("NULL")
    }
    println(bev) */

    //null合体演算子（エルヴィス演算子）
    //?:の左辺がnullだったら右辺を実行
    var bev = readLine()
    /* bev = null */
    val bes = bev ?: "Bottle"
    println(bes)
}

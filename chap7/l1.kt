fun main(args: Array<String>) {
    /* //部分文字列を抽出
    val name = "matajupi's Folly"
    //[']のindexを見つける
    val apso = name.indexOf('\'')
    //上のindexをもとに部分文字列を生成
    //apsoの場所は含めないのでuntilでOK
    //値の範囲を表すIntRage型を受け取る
    val afname = name.substring(0 until apso)
    println(afname) */

    //splitはそのまま
    val dataf = "hello,world,bye"
    val datal = dataf.split(',')
    println(datal[0])
    println(datal[1])
    println(datal[2])

}

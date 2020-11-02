import java.io.File

fun main(args: Array<String>) {
    /* val menuFile = File("file.txt")
    menuFile.setReadable(true)
    menuFile.setWritable(true)
    menuFile.setExecutable(false) */

    //applyを使いコードの重複をなくす
    //暗黙のうちに呼び出される
    /* val menuFile = File("file.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(true)
    } */

    //letはその変数値に施す後処理みたいなもの
    val fIS = listOf(1, 2, 3).last().let {
        it * it
    }
    println(fIS)

    //レシーバとは obj.method() でいうobjの部分に当たる

    
}

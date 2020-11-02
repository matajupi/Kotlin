import java.io.File

fun main(args: Array<String>) {
    val nameLength = with("Kosuke Futamata") {
        length
    }
    println(nameLength)

    var fileContents: List<String> //変数の定義のみを行っている
    //alsoはレシーバを返す(返り値がない)
    File("p1.kt").also {
        println(it.name)
    }.also {
        fileContents = it.readLines()
    }

    fileContents.forEach {
        println(it)
    }
}

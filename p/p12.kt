import java.io.File

fun main(args: Array<String>) {
    val patronList = mutableListOf("Eli", "Mike", "Chiaki", "Kosuke")
    val menuList = File("test.txt")
        .readText()
        .split("\n")
    patronList.forEach {
        println(it)
        println(menuList.shuffled().first())
    }
    menuList.forEachIndexed { index, data ->
        println("$index $data")
    }
}

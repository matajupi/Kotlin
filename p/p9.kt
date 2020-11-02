import java.io.File

fun main(args: Array<String>) {
    val fileContents = File("p1.kt")
        .takeIf { it.canRead() && it.canWrite() }
        ?.readText() ?: ""
    println(fileContents)

    println("the files can't read, can they?")
    val filenum = File("p1.kt")
        .takeUnless { it.canRead() }?.let {
            "No, they cannot"
        } ?: "Yes, they can"

    println(filenum)
}

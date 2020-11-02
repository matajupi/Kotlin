object StringData {
    var stringData = ""
        get() = field
        set(value) {
            if (value.length < 20) field = value
        }
    fun printData() {
        println(this.stringData)
    }
}

fun main(args: Array<String>) {
    StringData.stringData = "First"
    StringData.printData()
}

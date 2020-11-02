fun main(args: Array<String>) {
    var obj: Any = readLine()!!.toString()
    if (obj is String) {
        println(obj.length)
    }
    if (obj !is String) {
        println("Not a String")
    }
    var el: Any = readLine()!!.toInt()
    if (el is String) {
        println("String")
    } else {
        var num = el as Int
        println(num)
    }
}

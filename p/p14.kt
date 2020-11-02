fun main(args: Array<String>) {
    var flag = false
    var count = 0
    while (!flag) {
        println("looooop")
        flag = (0..9).toList().shuffled().first() == 0
        count++
        if (count == 5) {
            println("break")
            break
        }
    }
    println("hi you were late")
}

fun Int.isPrime(): Boolean {
    (2 until this).map {
        if (this % it == 0) return false
    }
    return true
}

//Sequence
//シーケンスは後についている操作を一つの関数とみて一つの値ごとに実行していく
//takeなどのようなところで条件を満たせばそれ以上ループはしない
fun main(args: Array<String>) {
    //start => 3, finish => ?
    val oneThousandPrimes = generateSequence(3) { value ->
        value + 1
    }.filter { it.isPrime() }.take(1000)

    print("finished seach...")
    readLine()

    oneThousandPrimes.forEach {
        println(it)
    }
}

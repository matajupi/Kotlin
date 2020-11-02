fun main(args: Array<String>) {
    //transform function
    //return copied list
    //関数型プログラミングではイミュータブルなコピーにするのが好ましい
    val animals = listOf("zebra", "giraffe", "elephant", "rat")
    val babies = animals.map { animal -> "A baby $animal" }
                        .map { baby -> "$baby with the cutest little tail ever!" }
    println(babies)
    println(animals)

    val tenDollarWords = listOf("auspicious", "avuncular", "obviate")
    val tenDollarWordLength = tenDollarWords.map { it.length }
    println(tenDollarWordLength)

    val ll = listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }
    println(ll)
}

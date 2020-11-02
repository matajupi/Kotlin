fun main(args: Array<String>) {
    runSim()
}

fun runSim() {
    val grefunc = conGF()
    println(grefunc("matajupi"))
    println(grefunc("matamata"))
    println(grefunc("jupiter"))
}

//numはstatic扱いになっている（静的な変数になっている）
fun conGF(): (String) -> String {
    val struct = "hospitals"
    var num = 5
    return { name: String ->
        val year = 2020
        num++
        println("Adding $num $struct")
        "Welcomt to sim $name $year"
    }
}

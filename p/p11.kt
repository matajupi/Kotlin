fun main(args: Array<String>) {
    var patronList = mutableListOf("Eli", "jack", "kosuke") //MutableList<Type>

    println(patronList)
    patronList.remove("Eli")
    patronList.add("Alex") //最後尾に
    patronList.add(0, "Alex") //位置指定
    println(patronList)
    patronList[patronList.size - 1] = "Seima"
    println(patronList)

    patronList.forEach {
        println(it)
    }

    for (patron in patronList) {
        println(patron)
    }

    patronList.forEachIndexed { index, patron ->
        println("$index ha $patron")
    }

    //List<Type> listOf()
    //MutableList<Type> mutableListOf()
    //Array<Type> arrayOf()
}

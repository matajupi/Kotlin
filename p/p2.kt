fun main(args: Array<String>) {
    val gref: () -> String = {
        "welcome"
    }
    println(gref())

    val gre1: (String, Int) -> String = { fanmo, num ->
            "welcom $fanmo $num"
     }

     println(gre1("funmo", 3))

     val gre2 = { fanmo: String ->
         "welcome $fanmo"
     }

     println(gre2("funmo"))

     getgre("maju") { moji, num ->
         "$moji ${num + 1}"
     }

     getgre("maju", ::gre1)

     println(createFunction()("maju"))
}

private inline fun getgre(name:String, gre: (String, Int) -> String) { //受け取る側はinline化をする
    println(gre(name, 3))
}

private fun gre1(name: String, num: Int): String {
    return "${name.count()} ${num * 3}"
}

private fun createFunction(): (String) -> String {
    val name = "Has"

    return { moji ->
        "$name $moji"
    }
}

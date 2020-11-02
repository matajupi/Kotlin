fun main(args: Array<String>) {
    //combine function
    val employees = listOf("Denny", "Claudette", "Peter")
    val shirtSize = listOf("large", "x-large", "medium")
    val employeeShirtSizes = employees.zip(shirtSize).toMap()
    //zip returns pair list
    println(employeeShirtSizes)

    //fold 引数はアキュムレータの初期値
    val foldedValue = listOf(1, 2, 3, 4).fold(0) { accumulator, number ->
        println("Accumulated value: $accumulator")
        accumulator + (number * 3)
    }

    println("Final value: $foldedValue")
}

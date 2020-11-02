sealed class Expr {
    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

fun eval(expr: Expr) : Double = when(expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    is Expr.NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    var num = readLine()!!.toDouble()
    var const1 = Expr.Const(num)
    var const2 = Expr.Const(num + 1.9)
    println(const1)
    println(eval(Expr.Sum(const1, const2)))
    println(eval(Expr.NotANumber))
}

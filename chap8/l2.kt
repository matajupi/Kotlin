fun main(args: Array<String>) {
    //バイナリコードを取得する
    val b = Integer.toBinaryString(42)
    println(b)
    //ビットをシフト
    val b2 = 42.shl(2) //42を2左にシフト
    println(Integer.toBinaryString(b2))
    val b3 = 42.shr(2) //42を2右にシフト
    println(Integer.toBinaryString(b3))
    //ビットを反転
    val b4 = 42.inv()
    println(Integer.toBinaryString(b4))
    //xor演算
    val b5 = 42.xor(33)
    println(Integer.toBinaryString(b5))
    //and演算
    val b6 = 42.and(10)
    println(Integer.toBinaryString(b6))
}

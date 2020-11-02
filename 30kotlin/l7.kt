//継承できるのは内部クラスだけ
sealed class ScreenStatus {
    class ON(private var channel: Int) : ScreenStatus() {
        override fun printChannel() = println("Channel : $channel")
        override fun changeChannel(num: Int) {
            channel = num
        }
    }

    //static methodみたいな感じ
    object OFF: ScreenStatus() { //object宣言でシングルトーンになる
        override fun printChannel() {}
        override fun changeChannel(num: Int) {}
    }
    abstract fun printChannel()
    abstract fun changeChannel(num: Int)
}

fun pushSwitch(status: ScreenStatus) : ScreenStatus {
    return when(status) {
        is ScreenStatus.OFF -> {
            println("Switch ON")
            ScreenStatus.ON(4)
        }
        is ScreenStatus.ON -> {
            println("Switch OFF")
            ScreenStatus.OFF
        }
    }
}

fun main(args: Array<String>) {
    var tv: ScreenStatus = ScreenStatus.OFF

    tv = pushSwitch(tv)
    tv.printChannel()

    tv.changeChannel(8)
    tv.printChannel()

    tv = pushSwitch(tv)
    tv.printChannel()
}

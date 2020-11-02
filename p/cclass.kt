class Sword(_name: String) {
    public var name = _name //この場合値はセッターを通らない
        get() = "The Lege $field"
        set(value) {
            field = value.toLowerCase().reversed().capitalize()
        }

    init {
        this.name = _name //この場合値はセッターを通る
    }
}

fun main(args: Array<String>) {
    val sword = Sword("mag")
    println(sword.name)

    sword.name = "kosuke"
    println(sword.name)
}

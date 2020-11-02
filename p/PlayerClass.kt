package mypack.player //パッケージ化

import java.io.File

class Player(_name: String, public var health: Int) { //プライマリコンストラクタ（プロパティ定義も）
    //プライマリコンストラクタはどれもこれらのパラメータを必要とするという意味（必ずフルで定義した場合のパラメータにする）
    //デフォルト引数も可能
    public var name = _name //これも可能
        get() = "${field.capitalize()} of ${this.hometown}"
        private set(value) {
            field = value.trim() //文字列の前後の空白を削除する
        }

    //プロパティは初期化時に代入が必要
    public var hometown = by lazy { this.selelctHometown() }

    public lateinit var ali: String //初期化の遅延

    //プライマリでもセカンダリでも呼び出される
    init {
        require(this.health > 0, { "omae zero dazo" })
        require(this.name.isNotBlank(), { "omae namae nainoka" })
    }

    //セカンダリコンストラクタ（コンストラクタのオーバーロードみたいな感じ）
    constructor(name: String) : this(name, health = 100) {
        if (this.name.toLowerCase() == "kar") health = 10000
    }

    private fun selectHometown() = File("test.txt").readText()
                                                .split("\r\n")
                                                .shuffled()
                                                .first()

    public fun castFireball(numFireballs: Int = 2) { //デフォルト引数
        println(this.name) //thisキーワード使える！！
        println("A glass into ($numFireballs)")
    }

    public fun dete() {
        this.ali = "Good"
    }

    public fun pro() {
        if (::ali.isInitialized) println(ali)
        //aliに何も代入されていないときStringのisInitializedを参照する
        //ことになりエラーが出るため::をつける
    }
}

public class Dice {
    public val rolledValue
    get() = (1..6).shuffled().first() //算出プロパティ（フィールドが生成されない）
}

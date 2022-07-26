package chap05.section2.bird2

//class Bird constructor(_name: String, _wing: Int, _beak: String, _color: String) {
//class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {

    init {
        println("----------초기화 블럭 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("----------초기화 블럭 끝----------")
    }

    /*
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color
    */

/*
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _color: String) {
        name = _name
        color = _color
        wing = 2
        beak = "short"
    }
*/

    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "long", "Yellow")
//    val coco2 = Bird("mybird2", "Red")
    val coco2 = Bird(wing = 2, beak = "long", color = "yellow")
    val coco3 = Bird(beak = "long", color = "yellow")
//    val coco4 = Bird(color = "yellow") // beak Property 의 default 값이 없기 때문에 에러

    coco.color = "Blue"

    println("coco.name: ${coco.name}")
    println("coco.color: ${coco.color}")
//    println("coco2.name: ${coco2.name}")
//    println("coco2.color: ${coco2.color}")
//    println("coco2.beak: ${coco2.beak}")
    coco.fly()
    coco.sing(3)
}
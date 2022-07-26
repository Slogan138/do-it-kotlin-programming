package chap05.section2

class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

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

    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "long", "Yellow")
    val coco2 = Bird("mybird2", "Red")
    coco.color = "Blue"

    println("coco.name: ${coco.name}")
    println("coco.color: ${coco.color}")
    println("coco2.name: ${coco2.name}")
    println("coco2.color: ${coco2.color}")
    println("coco2.beak: ${coco2.beak}")
    coco.fly()
    coco.sing(3)
}
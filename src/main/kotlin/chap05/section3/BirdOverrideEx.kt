package chap05.section3.overrid

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly Wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

class Parrot(name: String, wing: Int, beak: String, color: String, var language: String) : Bird(
    name, wing, beak, color
) {

    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) {
//        super.sing(vol)
        println("I'm a Parrot $vol")
        speak()
    }
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    lark.singHitone()
    parrot.speak()
    lark.fly()

    parrot.sing(3)
    lark.sing(3)
}


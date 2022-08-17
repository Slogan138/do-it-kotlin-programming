package chap08.section1.limit

open class Animal(val size: Int)

class Cat(val jump: Int) : Animal(50)

class Spider(val poison: Boolean) : Animal(1)

//class Box<T>
//class Box<out T>
class Box<out T : Animal>(val element: T) {
    fun getAnimal(): T = element
    /*
    fun setAnimal(new: T) {
        element = new
    }
    */
}
//class Box<in T>

fun main() {
    val c1 = Cat(10)
    val s1 = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1 ${a1.size} ${a1.poison}")

    val b1: Box<Animal> = Box<Animal>(c1)
//    val b2: Box<Cat> = Box<Cat>()
    val b2: Box<Animal> = Box<Cat>(c1)
    val b3 = Box<Spider>(s1)
//    val b4: Box<Number> = Box<Int>()
}
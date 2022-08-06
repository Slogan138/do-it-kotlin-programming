package chap06.section2

class Person {
    lateinit var name: String // var Property 만 lateinit 지정 가능

    fun test() {
        if (!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val gildong = Person()
//    println("name = ${gildong.name}") // UninitializedPropertyAccessException 발생
    gildong.test()
    gildong.name = "GilDong"
    gildong.test()
    println("name = ${gildong.name}")
}
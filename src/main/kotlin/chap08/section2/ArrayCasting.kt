package chap08.section2

fun main() {
//    val b = Array(10) { 0 }
//    val b = Array<Number>(10) { 0 }
    val b = Array<Any>(10) { 0 }
    b[0] = "Hello World"
    b[1] = 1.1

    println(b.contentToString())
}
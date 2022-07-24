package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: Exception) {
        println("Exception is handled.")
    } finally {
        println("Hello")
    }
}
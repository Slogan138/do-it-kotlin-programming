package chap02.section3

fun main() {
    var test: Number = 12.2 // Float 형으로 Smart Case
    println("$test")

    test = 12 // Int 형으로 Smart Case
    println("$test")

    test = 120L // Long 형으로 Smart Case
    println("$test")

    test += 12.0f // Float 형으로 Smart Case
    println("$test")
}
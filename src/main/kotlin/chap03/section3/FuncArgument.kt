package chap03.section3

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

fun main() {
    val result1 = sum(10, 3)
    val result2 = mul(sum(3, 3), 2)

    println("result1: $result1, result2: $result2")
    println(funcFunc())
}

fun funcFunc(): Int {
    return sum(2, 2)
}
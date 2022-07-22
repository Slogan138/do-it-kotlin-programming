package chap03.section5

fun main() {
    //val multi = 3.multiply(10) // 일반적인 표현

    val multi = 3 multiply 10 // 중위 표현법
    println("multi: $multi")
}

// Int 함수 확장
infix fun Int.multiply(x: Int): Int {
    return this * x
}
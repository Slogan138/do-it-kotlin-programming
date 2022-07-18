package chap02.section3

fun main() {
//    val a: Int = 128
    val a: Int = 127
    val b = a

    println(a === b) // 자료형이 기본형인 int 가 됨 값이 동일하여 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 동일
    println(c === d) // 값의 내용은 같지만 참조를 비교해 다른 객체
    println(c === e) // 값의 내용도 같고 참조된 객체도 동일
}
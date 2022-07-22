package chap03.section6

fun a() = b() // 최상위 함수이므로 b() 함수 선언 위치에 상관 없이 사용 가능
fun b() = println("b") // b() 함수의 선언

fun c() {
    fun e() = println("e")
    fun d() = e() // d() 는 지역함수이므로 e() 의 이름을 모름
    d()
}

fun main() {
    a()
    c()
    //e() // c() 함수에 정의된 e() 는 c 의 블록을 벗어난 곳에서 사용할 수 없음
}
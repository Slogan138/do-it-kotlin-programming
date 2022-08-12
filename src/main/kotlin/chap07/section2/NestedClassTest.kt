package chap07.section2

class Outer {
    val ov = 5

    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" // ov 는 접근 불가
    }

    fun outside() {
        val msg = Nested().greeting() // Outer 객체 생성 없이 중첩 클래스 메소드 접근
        println("[Outer]: $msg, ${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 에러! Outer 객체 생성 필요
    Outer().outside()
    val outer = Outer()
    outer.outside()
}
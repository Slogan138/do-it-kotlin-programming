package chap04.section3

fun main() {
    retFunc()
    retFunc1()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline 삭제, inline 여부와 상관없이 라벨 사용가능
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
//    inlineLambda(13, 3) lit@{ a, b ->
    inlineLambda(13, 3) { a, b ->
        val result = a + b
//        if (result > 10) return@lit
        if (result > 10) return@inlineLambda
        println("result: $result")
    }
    println("end of retFunc")
}

fun retFunc1() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) return
        println("result: $result")
    })
    println("end of retFunc")
}
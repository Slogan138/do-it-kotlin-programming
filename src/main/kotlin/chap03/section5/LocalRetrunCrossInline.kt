package chap03.section5.crossinline

fun main() {
    shortFunc(3) {
        println("First call: $it")
        // return 사용 불가
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()") // 해당 문장은 실행되지 않음
}

fun nestedFunc(body: () -> Unit) {
    body()
}
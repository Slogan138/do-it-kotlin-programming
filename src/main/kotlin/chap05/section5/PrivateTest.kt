package chap05.section5.private

private class PrivateTest {
    private var i = 1
    private fun privateFunc() {
        i += 1
        println(i)
    }

    fun access() { // Public
        privateFunc()
    }
}

class OtherClass {
    //    val pc = PrivateTest() // 공개 생성 불가
//    private val pc = PrivateTest() // Private 로는 생성 가능

    fun test() {
        val pc = PrivateTest()
        pc.access()
    }

}

fun main() {
    val pc = PrivateTest()

//    pc.i = 3
//    pc.privateFunc()

    pc.access()
}

fun topFunction() {
    val pc = PrivateTest()
}
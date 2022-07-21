package chap03.section3

fun main() {
    val result: Int

    val multi1 = { x: Int, y: Int ->
        println("x * y")
        //x
        x * y
    }
    val multi2: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
//    val multi3 = { x, y -> x * y } // 에러 발생

    val greet: () -> Unit = { println("Hello") }
//    val nestedLambda: () -> () -> Unit = { { println("World!") } }
    val nestedLambda: () -> () -> Int = { { 20 } }

    result = multi1(10, 20)
    println(result)
    greet()
//    nestedLambda()()

    val test = nestedLambda()()
    println(test)
}

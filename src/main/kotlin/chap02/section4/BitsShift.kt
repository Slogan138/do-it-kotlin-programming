package chap02.section4

fun main() {
    val num = 4 // 0100

    println(num.shl(2)) // 0000 0100 -> 0001 0000
    println(num shl 2) // 중위 표현법 (infix)

    println(num.shl(1)) // 0000 0100 -> 0001 0000
    println(num shl 1) // 중위 표현법 (infix)

    println(num.shr(2))
    println(num shr 2)

    println(num.shr(1)) // 0000 0100 -> 0001 0000
    println(num shr 1) // 중위 표현법 (infix)

    println(num.ushr(2))
    println(num ushr 2)

    println(num.ushr(1)) // 0000 0100 -> 0001 0000
    println(num ushr 1) // 중위 표현법 (infix)

    var x = 4
    var y = 0b000_1010
    var z = 0x0F

    println("x shl 2 -> ${x shl 2}")
    println("x.inv -> ${x.inv()}")

    println("x shl 4 -> ${x * 16}, ${x shl 4}")
    println("y shr 2 -> ${y / 4}, ${y shr 2}")
    println("z shl 4 -> ${z * 16}, ${z shl 4}")

    x = 64
    println("x shr 4 -> ${x / 4}, ${x shr 2}")
}
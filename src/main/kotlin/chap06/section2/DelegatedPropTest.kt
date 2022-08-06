package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }

    println(max)
    max = 10
    println(max)

    max = 5 // oldValue 인 10 보다 작기 때문에 5 할당 X
    println(max)
}
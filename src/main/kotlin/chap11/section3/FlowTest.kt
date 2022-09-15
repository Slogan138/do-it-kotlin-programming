package chap11.section3

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun myFlow() = flow {
    emit("One")
    emit("Two")
    delay(100)
    emit("Three")
}

fun main() = runBlocking {
    myFlow().collect {
        println(it)
    }
}
package chap11.section2

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("runBlocking: $coroutineContext")

    val request = launch {
        println("request: $coroutineContext")
        GlobalScope.launch {
            println("Job1: Before suspend function, $coroutineContext")
            delay(1000)
            println("Job1: After suspend function, $coroutineContext")
        }
//        launch(Dispatchers.Default) {
        CoroutineScope(Dispatchers.Default).launch {
            delay(100)
            println("Job2: Before suspend function, $coroutineContext")
            delay(1000)
            println("Job2: After suspend function, $coroutineContext")
        }
    }

    delay(500)
    request.cancel()
    delay(1000)
    println("end")
}
package chap11.section2.scope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking(Dispatchers.Default) {
    launch(Dispatchers.IO) {
        delay(1200L)
        println("Task from runBlocking")
    }

    coroutineScope {
        launch {
            delay(1500L)
            println("Task from nested launch")
        }
        delay(200L)
        println("Task from coroutineScope")
    }

    println("End of runBlocking")
}
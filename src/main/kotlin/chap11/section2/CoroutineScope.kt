package chap11.section2.scope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

fun main(): Unit = runBlocking(Dispatchers.Default) {
    val threadPool = Executors.newFixedThreadPool(4)
    val myContext = threadPool.asCoroutineDispatcher()

    launch(Dispatchers.IO) {
        delay(1200L)
        println("Task from runBlocking")
    }

    coroutineScope {
        launch(myContext) {
            delay(1500L)
            println("Task from nested launch")
        }
        delay(200L)
        println("Task from coroutineScope")
    }

    println("End of runBlocking")
}
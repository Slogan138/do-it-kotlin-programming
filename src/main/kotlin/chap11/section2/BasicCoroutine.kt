package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
        doSomething()
    }
    println("Hello ")
    println("Job: ${job.isActive}, ${job.isCompleted}")
    Thread.sleep(2000L)
    println("Job: ${job.isActive}, ${job.isCompleted}")
}

suspend fun doSomething() {
    println("Do Something")
}
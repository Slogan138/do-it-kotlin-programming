package chap11.section4.threadconfine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) {
                    action()
                }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    massiveRun(counterContext) {
//        withContext(counterContext) {
        counter++
//        }
    }
    println("Counter = $counter")
}
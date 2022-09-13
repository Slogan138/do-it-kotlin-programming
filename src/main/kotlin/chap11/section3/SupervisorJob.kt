package chap11.section3

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Caught $exception")
    }

    val supervisor = SupervisorJob()
    with(CoroutineScope(coroutineContext + supervisor)) {
        val first = launch(handler) {
            println("First Child is failing")
            throw AssertionError("First Child is cancelled")
        }
        val second = launch {
            first.join()
            println("firstChild.isCancelled: ${first.isCancelled}, but second one is still active")
            try {
                delay(Long.MAX_VALUE)
            } finally {
                println("Second child is cancelled because supervisor is cancelled")
            }
        }
        first.join()
        println("Cancelling Supervisor")
        supervisor.cancel()
        second.join()
    }
}
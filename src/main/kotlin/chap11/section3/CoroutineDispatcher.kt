package chap11.section3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val jobs = arrayListOf<Job>()
    jobs += launch { // 아무런 인자가 없을때 부모인 runBlocking 문맥 상속
        println("launch: $coroutineContext, ${Thread.currentThread()}")
    }
    jobs += launch(Dispatchers.Default) { // Default Dispatcher
        println("launch(Default): $coroutineContext, ${Thread.currentThread()}")
    }
    jobs += launch(Dispatchers.Unconfined) { // main 스레드에서 작업
        println("launch(Unconfined): $coroutineContext, ${Thread.currentThread()}")
        delay(500)
        println("launch(Unconfined): $coroutineContext, ${Thread.currentThread()}")
    }
    jobs += launch(Dispatchers.IO) { // 입출력 중심의 문맥
        println("launch(IO): $coroutineContext, ${Thread.currentThread()}")
    }
    jobs += launch(newSingleThreadContext("myThread")) { // 새 스레드를 생성
        println("launch(new): $coroutineContext, ${Thread.currentThread()}")
    }
    jobs.forEach { it.join() }
}
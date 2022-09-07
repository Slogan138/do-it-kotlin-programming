package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial(): Job {
    val job = GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
    return job
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val job = worksInSerial()
        job.join()
//    readLine() // 바로 종료하지 않기 위함
    }
    println("time: $time")
}
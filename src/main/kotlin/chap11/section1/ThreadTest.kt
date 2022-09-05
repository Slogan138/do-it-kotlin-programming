package chap11.section1

class SimpleThread : Thread() {
    override fun run() {
        println("Class Thread: ${currentThread()}")
    }
}

class SimpleRunnable : Runnable {
    override fun run() {
        println("Interface Thread: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)

    thread2.start()

    object : Thread() {
        override fun run() {
            println("object Thread: ${currentThread()}")
        }
    }.start()

    Thread {
        println("Lambda Thread: ${Thread.currentThread()}")
    }.start()
}
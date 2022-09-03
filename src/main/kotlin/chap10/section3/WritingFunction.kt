package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val path = "/Users/jinwoo/hello.txt"
    val text = "Hello World, \n 안녕하세요\n"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.write(text)
    printWriter.flush()
    printWriter.close()

    File(path).printWriter().use { it.println(text) }
}
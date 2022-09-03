package chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "/Users/jinwoo/hello.txt"
    val text = "Hello World, \n 안녕하세요\n"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (exception: IOException) {
        // Do Something
    }
}
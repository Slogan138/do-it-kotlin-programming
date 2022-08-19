package chap08.section2

import java.util.Arrays

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    println(arr.get(2))
    println(arr[2])

    println(arr.size)

    for (element in arr) {
        print(element)
    }

    println(Arrays.toString(arr))
    println(arr.sum())

//    arr.set(1, 8)
    arr[1] = 8
    println(arr.contentToString())
}
package chap09.section4

fun main() {
    val list1 = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 2, 3)

    println(list1 + "four")
    println(list2 + 4)
    println(list2 + "hello")
    println(list1 + list2)

    println(list2 - 1)
    println(list2)
    println(list1 - "one")

    println(list1 + listOf("abc", "def"))
}
package chap08.section2

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    val sortedArr = arr.sortedArray()
    println(sortedArr.contentToString())

    val sortedArrDesc = arr.sortedArrayDescending()
    println(sortedArrDesc.contentToString())

    arr.sortDescending()
    println(arr.contentToString())

    val listSorted: List<Int> = arr.sorted()
    val listSortedDesc: List<Int> = arr.sortedDescending()
    println("LIST: $listSorted")
    println("LIST: $listSortedDesc")

    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { it.length }
    println(items.contentToString())
}
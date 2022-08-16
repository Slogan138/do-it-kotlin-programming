package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
//    val obj1: Child = Parent() // 불가능
    val obj1 = Parent()
    val obj2: Parent = Child()

//    val obj3: Cup<Child> = Cup<Parent>() // Type MisMatch
//    val obj4: Cup<Parent> = Cup<Child>() // Type MisMatch
}
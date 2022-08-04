package chap06.section1

/*
class Person(_id: Int, _name: String, _age: Int) {
    var id: Int = _id
    val name: String = _name
    val age: Int = _age
}
*/

class Person(var id: Int, val name: String, val age: Int)

fun main() {
    val person = Person(1, "GilDong", 30)

    person.id = 2 // Setter 동자

    println(person.id) // Getter 동작
}
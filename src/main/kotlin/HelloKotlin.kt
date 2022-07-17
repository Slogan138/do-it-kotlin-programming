import io.slogan.doit.Person as User

fun main() {
    println("Hello World!")

    val person = User("Gildong", 20) // Heap 에 저장됨
    val person2 = Person(123, "Gildong", "Programmer")

    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)
package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("GilDong", "Kotlin")

    /*
    val a = person.let {
        it.skills = "Android"
        "Success"
    }
    */

    val a = person.also {
        it.skills = "Android"
    }
    println("a: $a, person: $person")
}
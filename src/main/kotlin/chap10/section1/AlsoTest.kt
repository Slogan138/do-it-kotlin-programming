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
        it.name = "Jason"
        it.skills = "Android"
    }
    println("a: $a, person: $person")

    val b = person.apply {
        name = "Jason"
        skills = "Android"
    }

    println("b: $b, person: $person")

    val c = person.run {
        name = "Jason"
        skills = "Android"
        "Success"
    }
    println("c: $c, person: $person")
}
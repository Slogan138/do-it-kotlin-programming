package chap10.section2

data class Person(var name: String? = null, var age: Int? = null, var job: Job? = null)

data class Job(var category: String? = null, var position: String? = null, var extension: Int? = null)

/*
fun person(block: (Person) -> Unit): Person {
    val p = Person()
    block(p)
    return p
}
*/
/*
fun person(block: Person.() -> Unit): Person {
    val p = Person()
    p.block()
    return p
}
*/
fun person(block: Person.() -> Unit) = Person().apply(block)

fun Person.job(block: Job.() -> Unit) {
    job = Job().apply(block)
}

fun main() {
    /*val person = person {
        it.name = "GilDong"
        it.age = 20
    }*/

    val person = person {
        name = "GilDong"
        age = 20
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }

    println(person)
}
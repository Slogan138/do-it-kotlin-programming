package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person by lazy {
        isPersonInstantiated = true
        Person("Kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 40) } // 위임 변수를 사용한 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // person 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // personDelegate 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}


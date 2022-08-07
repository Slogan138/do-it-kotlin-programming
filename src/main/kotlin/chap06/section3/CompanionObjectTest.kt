package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngdeok"

    companion object { // Singleton 으로 정의
        var language: String = "Korean"

        fun work() {
            println("working...")
        }
    }
}

fun main() {
    val person = Person()

    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" // 기본값 변경 가능
    println(Person.language)
    Person.work()
    println(person.name) // name 은 companion object 가 아니므로 에러
}
package chap06.section1

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field // id 값을 가르키는 일종의 Pointer

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) { // Custom Setter
            field = value + 10
        }
}

fun main() {
    val user = User(1, "GilDong", 30)
    user.age = 35
    println("user.age = ${user.age}")
}
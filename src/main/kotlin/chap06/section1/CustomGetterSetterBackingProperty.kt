package chap06.section1.customprotperty

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user = User(1, "GilDong", 35)
    user.name = ""
    println("user.name = ${user.name}")
}
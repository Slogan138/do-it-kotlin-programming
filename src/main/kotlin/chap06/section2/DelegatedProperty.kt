package chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Noname") { property, oldValue, newValue ->
        println("old: $oldValue, new: $newValue")
    }
}

fun main() {
    val user = User()

    user.name = "GilDong"
    user.name = "Dooly"
}
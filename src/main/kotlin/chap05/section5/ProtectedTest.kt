package chap05.section5.protected

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
        println(i)
    }

    fun access() {
        protectedFunc()
    }
}

class Derived : Base() {
    var j = i + 1
    fun derivedFunc(): Int {
        protectedFunc()
        return i
    }
}

class Other {
    fun other() {
        val base = Base()
    }
}

fun main() {
    val base = Base()
//    base.i
//    base.protectedFunc()
    base.access()

    val derived = Derived()
    derived.j = 3
    derived.derivedFunc()
}
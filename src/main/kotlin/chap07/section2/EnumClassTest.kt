package chap07.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(val prio: String) : Score {
    NORMAL("Third") {
        override fun getScore() = 100
    },
    SILVER("Second") {
        override fun getScore() = 500
    },
    GOLD("First") {
        override fun getScore() = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()) {
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}
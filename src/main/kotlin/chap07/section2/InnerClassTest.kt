package chap07.section2

class SmartPhone(val model: String) {

    val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = println("$model : Installed on $cpu with $size Gb")
    }

    fun powerOn(): String {
        class Led(val color: String) {
            fun blink() = "Blinking $color on $model"
        }

        val powerStatus = Led("Red")
        return powerStatus.blink()
    }
}

fun main() {
    val mySDCard = SmartPhone("S7").ExternalStorage(128)
    mySDCard.getInfo()
    println(SmartPhone("S8").powerOn())
}
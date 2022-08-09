package chap07.section1

abstract class Vehicle(val name: String, private val color: String, private val weight: Double) {

    // 추상 프로퍼티 - 하위 클래스에서 반드시 오버라이딩
    abstract val maxSpeed: Double

    // 비추상 프로퍼티
    var year: String = "2008"

    // 추상 메소드
    abstract fun start()
    abstract fun stop()

    // 비추상 메소드
    fun displaySpec() {
        println("name: $name, color: $color, weight: $weight, year: $year, maxSpeed: $maxSpeed")
    }
}

class Car(
    name: String,
    color: String,
    weight: Double,
    override val maxSpeed: Double
) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn() {
        println("Auto Pilot ON")
    }
}

class MotorBike(
    name: String,
    color: String,
    weight: Double,
    override val maxSpeed: Double
) : Vehicle(name, color, weight) {

    override fun start() {
        println("MotorBike Started")
    }

    override fun stop() {
        println("MotorBike Stopped")
    }
}

fun main() {
    var car = Car("Matiz", "gold", 1000.0, 100.0)
//    var v = Vehicle("Matiz", "gold", 1000.0) // 추상 클래스로부터 생성 불가
    var motor = MotorBike("Motor1", "blue", 1000.0, 100.0)

    car.year = "2014"
    car.displaySpec()

    motor.displaySpec()
    car.start()
    car.stop()
}
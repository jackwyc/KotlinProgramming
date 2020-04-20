package chap06.section2

interface Car {
    fun go(): String
}

class VanImpl(val power: String) : Car {
    override fun go() = "has $power and used for loading the burden"
}

class SportImpl(val power: String): Car {
    override fun go() = "has $power and used for the race"
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100"))
    val my350z = CarModel("350Z 2008", SportImpl("350"))

    myDamas.carInfo()
    my350z.carInfo()
}
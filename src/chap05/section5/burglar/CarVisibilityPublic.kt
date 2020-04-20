package chap05.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    private var year: Int = _year
    public var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean): Car(
        _year, _model, _power, _wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean): this(2014, "basic", "100hp", "normal",
    _name, _key) {
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("-----[Tico] access()-----")
            // super.year // unable to access private
            println("super.model = ${super.model}") // public
            println("super.power = ${super.power}") // protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key)

            // driver.name // unable to access private
            println("Driver().license = ${driver.license}") // public
            driver.driving() //internal
        } else {
            println("You are a burglar")
        }
    }
}

class Burglar() {
    fun steal(anycar: Any) {
        if (anycar is Tico) {
            println("-----[Burglar] steal()-----")
            // println(anycar.power) // unable to access protected
            // println(anycar.year) // unable to access private
            println("anycar.name = ${anycar.name}") // public
            println("anycar.wheel = ${anycar.wheel}") // internal
            println("anycar.model = ${anycar.model}") // public

            println(anycar.driver.license) // public
            anycar.driver.driving() // internal
            // println(Car.start()) // unable to access protected
            anycar.access("Don't know")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
    // val car = Car() // unable to create protected one
    val tico = Tico("Kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}
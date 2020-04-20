package chap05.section2.init

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    init {
        println("-----Start Initial Block-----")
        println("Name is $name, Beak is $beak")
        this.sing(3)
        println("-----Initial Block Finished-----")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}
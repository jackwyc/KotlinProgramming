package chap09.section3

fun main() {
    val animals = mutableSetOf("Lion", "Tiger", "Dragon", "Elephant", "Hippo")
    println(animals)

    animals.add("Dragon")
    println(animals)

    animals.remove("Lion")
    println(animals)
}
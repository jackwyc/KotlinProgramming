package chap07.section1

abstract class Printer {
    abstract fun print()
}

val myPrinter = object: Printer() {
    override fun print() {
        println("Output")
    }
}

fun main() {
    myPrinter.print()
}
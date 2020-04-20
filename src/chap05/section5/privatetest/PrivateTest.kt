package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access(){
        privateFunc()
    }
}

class OtherClass {
    // val opc = PrivateClass() // unable -> need to be declared with private
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    // pc.i // unable to access
    // pc.privateFunc() // unable to access
}

fun TopFunction() {
    val tpc = PrivateClass()
}
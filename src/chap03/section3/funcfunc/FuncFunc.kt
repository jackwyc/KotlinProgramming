package chap03.section3.funcfunc

fun main() {
    println("funcfunc: ${funcfunc()}")
}

fun sum(a: Int, b: Int) = a + b

fun funcfunc(): Int {
    return sum(2, 2)
}
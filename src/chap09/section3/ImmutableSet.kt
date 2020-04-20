package chap09.section3

fun main() {
    val mixedTypesSet = setOf("Hello", 7, "world", 3.14, 'c')
    val intSet: Set<Int> = setOf<Int>(1, 7, 7)

    println(mixedTypesSet)
    println(intSet)
}
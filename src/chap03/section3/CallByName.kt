package chap03.section3

fun main() {
    val result = callByName(otherLamda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLamda: () -> Boolean = {
    println("otherLamda function")
    true
}
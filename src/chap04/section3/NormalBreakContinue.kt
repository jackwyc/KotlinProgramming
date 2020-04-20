package chap04.section3

fun main() {
    for(i in 1..5) {
        if (i == 3) break // break -> stop at 3, continue -> skip 3
        println(i)
    }
    println("outside")
}
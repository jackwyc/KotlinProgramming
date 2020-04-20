package chap09.section3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(9, 4, 7, 1)
    intsHashSet.add(5)
    intsHashSet.remove(9)
    intsHashSet.add(7)
    println(intsHashSet)
}
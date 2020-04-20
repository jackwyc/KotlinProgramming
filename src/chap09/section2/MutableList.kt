package chap09.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("A", "B", "C")
    mutableList.add("Z")
    mutableList.removeAt(1)
    mutableList[0] = "Q"
    println(mutableList)

    val mutableListMixed = mutableListOf("Android", "iOS", 5, 16, 'X')
    println(mutableListMixed)
}
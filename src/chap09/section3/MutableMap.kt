package chap09.section3

fun main() {
    val capitalCityMap: MutableMap<String, String>
        = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("Taiwan", "Taipei")
    capitalCityMap.remove("China")
    println(capitalCityMap)
}
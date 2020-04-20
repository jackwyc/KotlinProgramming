package chap04.section3

fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception) {
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount : Int) {
    if (amount < 1000)
        throw Exception("Balance is $amount and under 1000.")
}
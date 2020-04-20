package chap06.section1

//class User(_id: Int, _name: String, _age: Int) {
//    val id: Int = _id
//    var name: String = _name
//    var age: Int = _age
//}

class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Jack", 30)
    val name = user.name
    user.age = 41

    println("name: $name, ${user.age}")
}


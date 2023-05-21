open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") 

fun main() {
    val lion: Lion = Asiatic("Rufo")  //passou o nome aqui                         
    lion.sayHello()
}
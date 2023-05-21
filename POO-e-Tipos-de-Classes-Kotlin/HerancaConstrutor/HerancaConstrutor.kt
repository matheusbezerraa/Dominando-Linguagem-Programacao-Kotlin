open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")  

class BrazilianTiger : Tiger(origin = "Brazil")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val tiger2: Tiger = BrazilianTiger()
    tiger2.sayHello()
}
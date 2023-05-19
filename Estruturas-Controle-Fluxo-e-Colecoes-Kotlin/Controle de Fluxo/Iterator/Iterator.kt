class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             
        return animals.iterator()                           
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion"), Animal("monkey")))

    for (animal in zoo) {                                   
        println("Watch out, it's a ${animal.name}")
    }

}
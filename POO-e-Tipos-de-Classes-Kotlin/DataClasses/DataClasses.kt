data class User(val name: String, val id: Int) {           
    override fun equals(other: Any?) =
        other is User && other.id == this.id               
}
fun main() {
    val user = User("Alex", 1)
    println(user)   
    println(" ")                                       

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   
    println("user == thirdUser: ${user == thirdUser}")
    println(" ")   

    // hashCode() function
    println(user.hashCode())                               
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
    println(" ")   

    // copy() function
    println(user.copy())                                   
    println(user === user.copy())                          
    println(user.copy(name = "Max"))                        
    println(user.copy(id = 3))    
    println(" ")                            

    println("name = ${user.component1()}")                 
    println("id = ${user.component2()}")
}
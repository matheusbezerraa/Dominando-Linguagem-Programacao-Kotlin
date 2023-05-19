fun main(){

    for(i in 0..3) {             //de 0 até 3
        print(i)
        print(" ")
    }
    println(" ")
    
    for(i in 0 until 3) {        //de 0 até 2
        print(i)
        print(" ")
    }
    println(" ")
    
    for(i in 2..8 step 2) {      //2 até 8 de 2 em 2
        print(i)
        print(" ")
    }
    println(" ")
    
    for (i in 3 downTo 0) {      //de 3 até 0
        print(i)
        print(" ")
    }
    println(" ")

    val x = 2
    if (x in 1..5) {            
      print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          
      print("x is not in range from 6 to 10")
    }
    
}
class MutableStack<E>(vararg items: E) {              
//exemplo de uma pilha
    private val elements = items.toMutableList()
  
    fun push(element: E) = elements.add(element) //lista adicionar elemento 
  
    fun peek(): E = elements.last() //lista ver o ultimo elemento 
  
    fun pop(): E = elements.removeAt(elements.size - 1) //lista eliminar elemento
  
    fun isEmpty() = elements.isEmpty() //lista vazia?
  
    fun size() = elements.size //lista tamanho
  
    override fun toString() = "MutableStack(${elements.joinToString()})"
  }

  fun main(){
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for(i in 1..stack.size()){ //tirar elemento até ficar vazia
        println("pop(): ${stack.pop()}")
        println(stack)
    }
  }
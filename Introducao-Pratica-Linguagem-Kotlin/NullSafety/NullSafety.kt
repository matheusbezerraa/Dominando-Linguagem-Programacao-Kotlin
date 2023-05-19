fun main(){

    var neverNull: String = "não pode ser null"

    var nullable: String? = "pode deixar null"
    nullable = null

    fun strLength(str: String?): Int{
        return str?.length ?: 0
    }

    println(strLength(nullable))
    println(strLength(neverNull))
}
fun describeString(maybeString: String?): String{

    if(maybeString != null && maybeString.length > 0){
        return "String com tamanho ${maybeString.length}"
    }else{
        return "Vazio ou String null"
    }
}

fun main(){
    println(describeString(null))
    println(describeString(""))
    println(describeString("Sanduiche"))
}

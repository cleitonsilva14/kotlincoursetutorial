

fun main(){

    var name:String = "Kotlin" // não pode ser null
    var lastName:String? = null // pode ser null



    println(name)
    println(lastName)

    lastName = "2017"

    println("lastName?.length = ${lastName?.length}")
    println(lastName?.length ?: "valor de lastName está null")

}
import java.math.BigDecimal

data class Product(val id: Long, var name:String, var price: BigDecimal, var description:String?)


fun main(args: Array<String>){

    val tv:Product = Product(1, "TV 65 4K", BigDecimal("3999.90"), "TV 4K 65'")

    println(tv.toString())
    println(tv.price)


    val phone = Product(2, "Phone X", BigDecimal("1599.90"), null)
    println(phone.toString())
    println(phone.description ?: "Not Description")

    val product3 = Product(3, "Notebook", BigDecimal("3599.90"), null)
    val (id, name, price) = product3
    println("$name, $price")

    println(tv == phone)




}
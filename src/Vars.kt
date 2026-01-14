// CTRL + ALT + O

import java.math.BigDecimal

fun main(){

    var name:String = "TV"
    val id:Int = 115522
    var size: Float = 5.2f
    var price: BigDecimal = BigDecimal("1400")
    var on:Boolean = true

    println("$id, $name, $size, $price, $on")

    println("${size / 2}")

    println("${price * BigDecimal("2")}")


}



fun Double.toBRL(): String {
    return "R$ ${String.format("%.2f", this)}"
}


fun main(){

    var price:Double = 9.90

    println(price.toBRL())


}

fun createCar(
    maker: String,
    model: String,
    color: String = "Blue",
    flex: Boolean = true
){
    println("$maker, $model, $color, $flex")
}

fun main(args: Array<String>){
    createCar("Fiat", "Fastback", "Red")
    createCar(model = "RAV 4", maker = "Toyota", flex =  false, color = "White")
}


fun printStringLength(obj: Any?) {
    if(obj is String){
        println(obj.length)
    }
}


fun main(){

    printStringLength("Kotlin")
    printStringLength(1)

}
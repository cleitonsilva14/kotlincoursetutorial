import com.sun.jdi.Value
import java.time.LocalDateTime

fun repeatChar(){
    println("-".repeat(45))
}

fun main(){

//    var counter = 10
//
//    for (c in 'A'..'Z') {
//        println("$c = $counter")
//        counter++
//    }


    var i = 1_000_000
    var l = 1_000_000_000_000
    println("$i, $l")
    println(i::class)
    println(l::class)

    repeatChar()
    println(Int.MIN_VALUE)
    println(Double.MAX_VALUE)
    repeatChar()

    repeatChar()

    println("kotlin" === "KOTLIN")
    println("KOTLIN" === "KOTLIN")
    repeatChar()

    var n:Long = 5
    println("${++n}")

    repeatChar()
    println(invert(51))
    println(invert(5.0))
    repeatChar()


    makeSomething("Cookie", "Kotlin")
    makeSomething("Request", "Kotlin", LocalDateTime.now().plusWeeks(-2), false)
    repeatChar()

}


fun invert(number:Int): Int {
    return number * -1
}

fun invert(number:Double): Double = number * -1

fun makeSomething(
    name: String,
    value: String? = null,
    expires: LocalDateTime? = LocalDateTime.now().plusMinutes(30),
    secure: Boolean? = true
){
    println("Name: $name, Value: $value, Expires: $expires, Secure: $secure")
}
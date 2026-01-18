fun r(){
    println("-".repeat(45))
}

fun main(){

    val things = setOf("Book", "Sugar", "Bird", 1)

    println(things)
    println(things::class)
    r()

    things.forEach(::println)
    r()

    println(things.size)
    r()



    val obj = mapOf(1 to "Audio", 2 to "Video")

    for ((k, v) in obj) {
        println("$k: $v")
    }

    r()

    val products = mapOf("cars" to listOf("Omega", "A3", "Fastback"), "colors" to listOf("Blue", "White"))

    for ((k, v) in products) {
        println("$k: $v, ${v.size}")
    }



}
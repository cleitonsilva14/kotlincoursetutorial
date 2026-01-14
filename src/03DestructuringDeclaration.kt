import java.util.UUID

data class Bird(var uuid: UUID, var name:String, var color:String?)

fun main(){

    // apenas name e color. Ignorar o UUID usar "_"
    val (_, name, color) = Bird(UUID.randomUUID(), "Popcorn", "Yello" )
    println("$name, $color")


    val languages = mapOf("Java" to 0.0, "Kotlin" to 1.0, "Python" to 2.0, "C++" to 3.0)

    for((language, value) in languages){
        println("$language = $value")
    }


}
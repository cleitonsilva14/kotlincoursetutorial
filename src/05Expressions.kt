import java.time.Year


fun main(){


    val idade = 18
    val status = if (idade >= 18) "Maior" else "Menor"

    println(status)

    val yearOfRelease = 2018

    val age = when (yearOfRelease) {
        in 2009..2026 -> "NEW"
        else -> "OLD"
    }

    println(age)

}
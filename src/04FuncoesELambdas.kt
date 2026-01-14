


fun main(){

    fun sum(a:Int, b:Int) = a + b

    println(sum(2017,4))

    val numbers = listOf(2,3,4,5,6,7,8,9,10)
    println(numbers)

    val odds = numbers.filter { it % 2 == 0 }

    println(odds)

    println(odds.map{it * it})



}
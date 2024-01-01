fun main(){
    val numberList = listOf(-1,1,4,7,3,2)
    println(numberList.sorted()) // Natural Sorting order
    println(numberList.partition {  number ->
        number < 3
    }) // Print the Number those are

    val (match, noMatch) = numberList.partition { number ->
        number < 3
    }
    println(match)
    println(noMatch)
}
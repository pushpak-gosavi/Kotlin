
fun main(){
    val list = listOf(1,2,3,4)
    println("-- List --")
    //println(list.filter { it%2==0 }.map { it * it }.any{ it < 10})
    list.filter(Int::evenNumber).map(Int::multiplication).any(Int::lessThanTen)
    println("--Sequance--")
    list.asSequence().filter(Int::evenNumber).map(Int::multiplication).any(Int::lessThanTen)
}

fun Int.evenNumber() : Boolean{
    println("evenNumber()")
    return  this % 2 == 0
}

fun Int.multiplication() : Int{
    println("multiplication")
    return this * this
}

fun  Int.lessThanTen() : Boolean{
    println("lessThanTen()")
    return this < 10
}
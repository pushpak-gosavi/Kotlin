fun main() {
    val intList = listOf<Int>(1, 2, 3, 4)
    val intArray= intArrayOf(1,2,3)
   // println(intList)
    println(sum(1,2,3, *intArray)) // spread operator using the adding other list
}

fun sum(vararg number: Int):Int{
    return number.sum()
}
fun main() {
    val numberList = listOf(1, 10, 100, 1000)
    val result = numberList.fold(initial = 0, operation = { sum, number ->
        println("Initial: $sum , number: $number")
        sum + number
    })
    println("Final: $result")

    val resul2 = numberList.runningFold(initial = 0){sum,number ->
        sum+number
    }
    println(resul2)
}
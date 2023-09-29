fun main() {
    val listIs = listOf(1, 2, 3)
    val lamdaUse = listIs.map(transform = { number ->
        "\"$number\""
    }
    )
    println(lamdaUse)
}
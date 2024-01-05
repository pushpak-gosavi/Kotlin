package programs

fun main() {
    val stringList: MutableList<String> = mutableListOf("A", "B", "C")

    val resultString = stringList.map { alphabets ->
        mapOf("Name" to alphabets)
    }

    println(resultString)
}
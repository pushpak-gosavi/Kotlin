package programs

fun main() {
    val stringList: MutableList<String> = mutableListOf("A", "B", "C")

    val resultString = stringList.map { alphabets ->
        mapOf("\"Name\"" to alphabets)
    }

    println(resultString)

    /** Q2
     * Given an array of string, such as

    ["A", "B", "C", "Z", "Q"]

    return an object such as

    { "A": 0,  "B": 1,  "C": 2,  "Z" : 3,  "Q": 4 }

    The numbers here are the positions of the string in the input array **/

    val secondAlphabetList = listOf("A", "B", "C", "Z", "Q")
    val resultSecondList = secondAlphabetList
        .withIndex()
        .associate { (index, value) -> "\"$value\"" to index }
        println(resultSecondList)
}



package programs

fun main() {
    val firstList: MutableList<MutableList<Int>> =
        mutableListOf(mutableListOf(-1, 2), mutableListOf(2, 3), mutableListOf(4, 5))
    val secondList: MutableList<MutableList<Int>> =
        mutableListOf(mutableListOf(0, 2), mutableListOf(2, -4), mutableListOf(4, -10))

    var ans = 0
    for (i in 0 until firstList.size) {
        if (firstList[i][0] == secondList[i][0]) {
            ans += (firstList[i][1] + secondList[i][1])
        }
    }
    println(ans)

}
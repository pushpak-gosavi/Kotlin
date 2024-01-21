package programs

fun main(){
    val matches: List<List<Int>> = listOf(listOf(1,3), listOf(2,3),listOf(3,6),listOf(5,6),listOf(5,7),listOf(4,5),listOf(4,8),listOf(4,9),listOf(10,4),listOf(10,9))
    var winners: MutableSet<Int> = mutableSetOf()
    println(matches)

    for(i in matches.indices){
        for(j in matches.indices){
            if (matches[i][0] != matches[j][1])
                winners.add(matches[i][0])
        }
    }
    println(winners)
}
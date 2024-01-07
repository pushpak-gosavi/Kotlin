package programs

fun main(){
   val firstList = listOf(listOf(1,2), listOf(2,3), listOf(3,4), listOf(4,5))
    println(firstList)
    var flag = true
    for (i in firstList.indices){
        if(firstList[i][0] - firstList[i+1][0] != 1 || firstList[i][1] - firstList[i+1][1] != 1){
            println("${firstList[i][0] - firstList[i+1][0] } ")
            println("${firstList[i][1] - firstList[i+1][1] } ")
            flag = false
            break;
        }
    }
    if (!flag)
        println("List is not containing same line")
    else println("List is on same line")
}
fun main(){
    val intList = mutableListOf(1,2,3,-1,0,-5,0,4)
    var number = 0
    for(i in intList.indices){
        if(intList[i] == 0){
            intList.removeAt(i)
            //intList.add(intList[i+1])
            intList.add(0)
            number++
        }
    }
    println(intList)
}
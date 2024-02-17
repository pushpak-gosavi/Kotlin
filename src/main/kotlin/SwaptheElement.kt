fun main(){
    val intList = mutableListOf(1,2,3,-1,0,-5,0,4)
    for(i in intList.indices){
        if(intList[i] == 0){
            intList.removeAt(i)
            intList.add(0)
        }
    }
    println(intList)
}
package programs

fun main(){
val list = mutableListOf(1,2,3,4,5,6,6,4)
    println(list.swapElement())
}

fun MutableList<Int>.swapElement():MutableList<Int>{
    for(i in 0 until this.size-1 step 2){
        this[i] = this[i+1].also { this[i+1]= this[i] }
    }
    return this
}

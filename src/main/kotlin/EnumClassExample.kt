fun main(){
    val priority = Priority.MEDIUM
    println(priority)
    println(priority.color)
    println(priority.number)
    val cons = Priority.valueOf("LOW")
    println(cons)

//    for(priority in Priority.values()){
//        println(priority)
//    }
}

enum class Priority(val color:String){
    LOW (color = "Green"),
    MEDIUM(color = "Yellow"),
    HIGH (color = "Red");

    val number:Int
        get() = when(this){
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}
fun main(){

    val info = PersonBody { "Albert" }
    println(info.getInfo())
    println(info.getBody())
}

fun interface PersonBody{
    fun getInfo():String
    fun getBody():String {
        return "Pushpa"
    }
}
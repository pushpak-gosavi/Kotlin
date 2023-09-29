fun main(){
    val name = "Pushpak"
    val nullName= null
    getName(name)
    getName(name = nullName)
}
fun getName(name:String?){
    println(name?.length ?: 0)
}
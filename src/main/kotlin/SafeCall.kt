fun main(){
    lateinit var name: String
    name = "Pushpak"
    val getData = name.let {
        println("12")
    }
    println(getData)
}
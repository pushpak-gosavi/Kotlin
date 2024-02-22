
interface Pushpak{
     fun main():String
}

class Child() : Pushpak{
     fun mains() {
        TODO("Not yet implemented")
    }

    override fun main(): String {
        TODO("Not yet implemented")
    }
}


fun main(){
    val name= "Pushpak"
    println(name.getName())
}
fun String.getName():String{
    return "{$this}"
}
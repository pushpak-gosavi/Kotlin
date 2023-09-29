

fun main(){
    SingltonExample.myName()
    SingltonExample2.myName()
}

object SingltonExample {
    fun myName(){
        println("My name is Pushpak")
    }
}

open class SingltonClass(private val name:String){
    fun myName(){
        println("My name is $name")
    }

}
object SingltonExample2 : SingltonClass(name = "Pushpak!!")
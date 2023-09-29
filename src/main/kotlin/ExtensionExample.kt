fun main(){
    //val name="Pushpak"
   // println(name)
    //println(name.h1())

    val demoExtensionObject= DemoExtension(name="Pushpak", age = 28, address = "Ahilya Nagar")
    println(demoExtensionObject.info())
    println(demoExtensionObject.address()) // address() is extension function
}

fun String.h1() : String{
    return "<h1>$this is calling from Extension<h1>"
}

class DemoExtension(
    private val name:String,
    private  val age:Int,
    val address:String
){
    fun info()= "My name is $name and age is $age"
}
//address variable is publc thats why we can able to accept the address in the extesnion function
fun DemoExtension.address ()= "this is extention through cll , my Address is $address"
fun main(){
    val car= Car(Vehical(3))
    println(car.getValues())
    val car2= Car(2)
    val car3=Car("Three")
    println(car2.getValues())
    println(car3.getValues())

    println(myName("Pushpak"))
    println(myName(3))
}
data class Vehical <T>(val Size:T)
 class Car<T>( private val tiers:T) {
    fun getValues():T = tiers
 }

fun <T> myName(name:T) : T = name
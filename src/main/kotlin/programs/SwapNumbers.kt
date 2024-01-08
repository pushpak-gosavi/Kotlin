package programs

fun main(){

    var a = 30
    var b = 20

     a= b.also { b=a }

    println("a = $a")
    println("b = $b")
}
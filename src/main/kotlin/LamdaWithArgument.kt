
fun main(){
    isPrimeCheck(7)
}
val isPrimeCheck :(Int) -> Boolean = {number ->
    var isPrime = true
    for(i in 2..number/2){
        if(number % i == 0) {
            isPrime = false
            break
        }
    }
    if(!isPrime){
        println("$number is not Prime")
    }else
        println("$number is prime")
    isPrime
}
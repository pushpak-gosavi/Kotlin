package programs

fun main(){
    var low = 1
    val high = 97
    println("print the $low to $high prime number..")
    while (low <= high){
        checkPrime(low)
        low++
    }
}

fun checkPrime(number:Int){
    var flag= false
    for (i in 2..number/2){
        if(number %i == 0){
            flag = true
            break
        }
    }

    if(!flag) print("$number ")
}
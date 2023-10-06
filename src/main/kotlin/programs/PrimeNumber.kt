package programs

fun main() {
//    for(i in 0..100) {
//        checkPrimeNumber(number = i)
//    }
    checkPrimeNumber(number = 9)
}
fun checkPrimeNumber(number: Int) {
    var flag = false
    if (number > 1) {
        for (i in 2..number / 2) {
            if (number % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            println("$number is Prime Number")
        else
            println("$number is not Prime Number")
    }

}
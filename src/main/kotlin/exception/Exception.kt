package exception

import java.lang.IllegalArgumentException

fun main() {
    println(getSalaryMonth(amount = 3000, months = 0))
}

fun getSalaryMonth(amount: Int, months: Int): Int {
    if (amount == 0) {
        throw IllegalArgumentException("Please enter the 'amount' grater than 0")
    } else if (months == 0) {
        throw IllegalArgumentException("Please enter the 'months' grater than 0")
    } else
        return amount / months
}
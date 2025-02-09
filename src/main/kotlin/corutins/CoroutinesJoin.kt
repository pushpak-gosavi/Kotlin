package corutins

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

//    val fun1 = launch {  fun1() }
//    fun1.join()
//    val fun2 = launch {  fun2() }
//    fun2.join()
//
//    println("Both function called")

    val deferred1 = async { calculateOne() }
    val deferred2 = async { calculateTwo() }

    val result1 = deferred1.await()
    val result2 = deferred2.await()

    println("Result 1: $result1")
    println("Result 2: $result2")
    println("Total: ${result1 + result2}")
}

suspend fun calculateOne(): Int {
    delay(2000)
    return 10
}

suspend fun calculateTwo(): Int {
    delay(6000)
    return 20
}

suspend fun fun1(){
    delay(2000L)
    println("First Function")
}

suspend fun fun2(){
    delay(2000L)
    println("Second Function")
}
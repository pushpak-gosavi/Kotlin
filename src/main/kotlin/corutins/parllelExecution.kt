package corutins

import kotlinx.coroutines.*

fun main() =  runBlocking{
    /**
     * Pallel Execution of corutines
     * using the Async and await function
     */
        val firstFun = async { networkCall1() }
        val secondFun =async {  networkCall2() }
        println(firstFun.await())
        println(secondFun.await())
}

suspend fun networkCall1():String{
    delay(3000)
    return "Network call 1"
}

suspend fun networkCall2():String{
    delay(3000)
    return "Network call 2"
}
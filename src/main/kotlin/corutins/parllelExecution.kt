package corutins

import kotlinx.coroutines.*
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() =  runBlocking{
    /**
     * Pallel Execution of corutines
     * using the Async and await function
     */
    val time = measureTime {
        val firstFun = async { networkCall1() }
        val secondFun = async { networkCall2() }
        println(firstFun.await())
        println(secondFun.await())
    }

    println("mesaure time in Milli Seconds = ${time.toDouble(DurationUnit.MILLISECONDS)}")

}

suspend fun networkCall1():String{
    delay(3000)
    return "Network call 1"
}

suspend fun networkCall2():String{
    delay(3000)
    return "Network call 2"
}
package corutins

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val coldFlow = flow {
        println("Flow started")
        for (i in 1..3) {
            delay(100) // simulate some delay
            emit(i)
        }
    }
    /**
     * Collecting from 1 to 3
     */
    println("Calling collect...")
    coldFlow.collect { value ->
        println("Collected $value")
    }

    /**
     * Collecting from 1 to 3
     */
    println("Calling collect again...")
    coldFlow.collect { value ->
        println("Collected $value again")
    }
}
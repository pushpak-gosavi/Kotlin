package structuredConcurancy

import getName
import kotlinx.coroutines.*

fun main() = runBlocking {
//   val parent= launch {
//        println("this is from Suspend fun")
//        launch {
//            delay(1000)
//            println("this from second")
//        }
//    }
//    delay(500)
//    //parent.cancel()
//    println("Parent cancel")

    val job = launch {
        repeat(5){
            println("working $it")
            delay(500)
        }
    }
    delay(1000)
    println("job 1 cancelling")
    job.cancel()
    job.join()
    println("job canceled")

    val result  = withContext(Dispatchers.IO){
        println(this.coroutineContext)
        withContext(Dispatchers.Default){
            println(this.coroutineContext)
        }
        true
    }
    println(result)
    println(Thread.currentThread())

}


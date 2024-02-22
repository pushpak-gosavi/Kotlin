package corutins

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    val job = GlobalScope.launch(Dispatchers.Default) {
//        repeat(5){
//            println("this is $it time")
//            delay(1000)
//        }
        println("Start the long running calculation...")
        if (isActive) {
            for (i in 30..50) {
                println("Result for i = $i : ${fib(i)}")
            }
        }
        println("Ending long running calculation...")
    }
    runBlocking {
        delay(100L)
        job.cancel()
        println("Job is cancel...")
    }
    println("Execute the code")
}

fun fib(n: Int): Long {
    return if (n == 0) 0
    else if (n == 1) 1
    else fib(n - 1) + fib(n - 2)
}

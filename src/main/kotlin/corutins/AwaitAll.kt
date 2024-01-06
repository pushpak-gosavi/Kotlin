package corutins

import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*

fun main() = runBlocking{

//    val deferredResults = listOf(
//        launch { fetcAsynchData(server = "Server A") },
//        launch { fetcAsynchData(server = "Server B") },
//        launch { fetcAsynchData(server = "Server C") },
//        launch { fetcAsynchData(server = "Server D") }
//    )
//
//   // val results = awaitAll(deferredResults.toTypedArray())
//    // Now, wait for the completion of all the async computations using awaitAll
//    val results = awaitAll(*deferredResults.toTypedArray())

    // Start multiple asynchronous computations using async block
    val deferredResults = listOf(
        async { fetcAsynchData("Server A") },
        async { fetcAsynchData("Server B") },
        async { fetcAsynchData("Server C") }
    )

    // Do some other work here...

    // Now, wait for the completion of all the async computations using awaitAll
    val results = awaitAll(*deferredResults.toTypedArray())

    results.forEachIndexed { index, result ->
        println("${index + 1}. Received data from ${result.first}: ${result.second}")
    }
}

suspend fun fetcAsynchData(server:String) :Pair<String, String>{
    delay(2000)
    val data = "Async data from $server"
    return server to data
}
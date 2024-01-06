package corutins

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val resultServer = async {
        secodFetchData("Server B")
       fetchData(server = "Server A")
       // fetchData(server = "Server B")
    }
    // retrive the result from the await() function
    println(resultServer.await())

}
suspend fun fetchData(server:String) : String {
    println("Hello First")
    delay(2000)
    return ("Result from Server : $server is running" )
}
suspend fun secodFetchData(server: String) : String{
    delay(1000)
    println("Hello, Secod")
    return server
}
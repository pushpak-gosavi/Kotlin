package corutins

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking{
    /*GlobalScope.launch {
        val data:Flow<Int> = getUser()
        data.collect{
           // println(it)
           // delay(1000)
            println("$it")
        }
    }

    Thread.sleep(8000)*/
//    val getAllData:Flow<Int> = getData()
//    getAllData.collect(collector = {
//        println(it)
//    })

//    val a = async { delay(1000L)
//                    println("Pushpak")
//    }
//    val b = async { delay(500L)
//            println("Ayushi")
//    }
//
//    println(a.await())
//    println(b.await())
    

}

suspend fun done(){
    CoroutineScope(Dispatchers.IO).launch {

    }
    GlobalScope.launch {

    }
}
fun getUser() = flow<Int> {
    val userlist = listOf(1,2,3,4,5,6,7)
    userlist.forEach { getData ->
        delay(1000)
        emit(getData)
    }
}

fun getData():Flow<Int> {
    val data = (1..10)
    return flow {
        data.forEach { value ->
            delay(1000L)
            emit(value)
        }
    }
}
package corutins

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(DelicateCoroutinesApi::class)
fun main(){
    GlobalScope.launch {
        world()
    }
    hello()
    Thread.sleep(2000L)
}

 fun hello(){
     println("Hello")
 }

suspend fun world(){
    delay(1000L)
    println("World!")
}
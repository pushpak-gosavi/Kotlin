package corutins

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main(){
    GlobalScope.launch {
        val data:Flow<Int> = getUser()
        data.collect{
            println("$it")
        }
    }

    Thread.sleep(8000)
}
fun getUser() = flow<Int> {
    val userlist = listOf(1,2,3,4,5,6,7)
    userlist.forEach { getData ->
        delay(1000)
        emit(getData)
    }
}
package inline

fun main() {

    printMessage({
        println("Message From A ")
        return@printMessage
    }) {
        println("Message from B")
        return@printMessage
    }
    println("Message From Main")
}

// Inline - for making the function inline meance whole boday taking and pasting
// crossinline - Means when retrun type consider as a local type then use crossline. must use reurn@unctionName
// noinline - means taking function pareamter as normal function within the inline scope. must use return@funcionName
inline fun printMessage(crossinline a: () -> Unit, noinline b: () -> Unit) {
    a.invoke()
    b.invoke()
}
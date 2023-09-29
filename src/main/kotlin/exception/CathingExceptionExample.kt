package exception

fun main(){
    try {
        println("Hello")
        function1()
    }catch (e: IlligalNumberException){
        println(e.message)
    }finally {
        println("Finally")
    }

    //function3()
}

fun function1(){
    throw IlligalNumberException("this is the Illigal Number exception")
}
fun function2(){
    function1()
}
fun function3(){
    function2()
}
class IlligalNumberException(description:String) : Exception(description)
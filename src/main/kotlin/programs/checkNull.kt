package programs

fun main() {
    var a: String?
    var b: String? = null

    val c: Int? = b?.length ?: 4
    println(c)
    lateinit var push: String
    var some: String = "push"
//    if (push.equals(some))
//        println("hello")


    val nako = null
    if (nako == null)
        println("True")

    val demoCheck = DemoCheckNull()
    demoCheck.demovar = "Same"
    //demoCheck.result = "is this ok?"
    println(demoCheck)
    println(demoCheck.result)
    val deoCheck by lazy {
        DemoCheckNull().demovar = "this is change"
        println()
    }


}

class DemoCheckNull {
    var demovar=""
    val result = abc
    companion object asd{
        const val abc = "Hello"
    }
}
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val listIs = listOf(1, 2, 3)
    val lamdaUse = listIs.map(transform = { number ->
        "\"$number\""
    }
    )
    println(lamdaUse)

    val sum = {a:Int , b:Int -> a+b}
    val s = sum(10 ,20)
    println(s)

    lamdaFun { number ->
        println("number is $number")
       "number is $number"
    }

    noArgumentlamda {
        println("Empty lamda")
    }

}

fun lamdaFun(getLamda: (Int) -> String){
    getLamda(Random.nextInt(1..5))
}

fun noArgumentlamda(noargs: () -> Unit){
    noargs()
}



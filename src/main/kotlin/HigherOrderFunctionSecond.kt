import java.awt.print.Book
import kotlin.random.Random

fun main(){
   val numberList = listOf<Int>(1,2,4,5,6)
    val isMoreThan2 : (Int) -> Boolean = {it > 2}

   println(numberList.any(isMoreThan2))

    button {
        println("hello")
    }

    newButton {number ->
        println("$number")
        "$number"
    }
}

 fun newButton (onClick: (Int) -> String){
     onClick(Random.nextInt(from = 1, until = 5))
 }
fun button (onClick : () -> Unit){
     onClick()
}
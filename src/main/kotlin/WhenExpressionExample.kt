import kotlin.random.Random

fun main() {

//    when (Random.nextInt(from = 1, until = 5)) {
//
//        1 -> {
//            println("this is First number")
//        }
//
//        2 -> {
//            println("this is Second number")
//        }
//
//        3 -> {
//            println("this is Three number")
//        }
//
//        4 -> {
//            println("this is Four number")
//        }
//
//
//    }

    when(getGender()){
        is PersonGender.Male -> {
            println("Male")
        }
        is PersonGender.Female -> {
            println("Female")
        }
    }
}

fun getGender(): PersonGender {
    return if (Random.nextInt(from = 1, until = 3) == 1) PersonGender.Male else PersonGender.Female
}

sealed class PersonGender {
    object Male : PersonGender()
    object Female : PersonGender()
}
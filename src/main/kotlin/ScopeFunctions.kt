fun main() {
//    val name:String? ="Pushpak"
//    val stringLength = name?.let {
//        println("this is not Empty")
//        it.get(4)
//    } ?: "Empty"
//    println(stringLength)

    //   val personRunObj= PersonRun(name = "Pushpak", age = 20)
//    val addTheAge= personRunObj.run {
//        age+=30
//        println("name : $name and age : $age")
//    }

//    val personRunObj= PersonRun(name = "Pushpak", age = 20)
//    val withPerson=  with(personRunObj){
//        age+=10
//        "name : $name and age : $age"
//    }
//    println(withPerson)

//    val personRunObj= PersonRun(name = "Pushpak", age = 20)
//    val applyObj = personRunObj.apply {
//        name = "Sangram"
//        age +=8
//    }
//    println(applyObj)

    val listSum = listOf<Int>(1, 2, 3, 4)
    val alsoList = listSum
        .also {
            println("given list is $it")
        }
        .sum()
    println(alsoList)

}

data class PersonRun(var name: String, var age: Int)
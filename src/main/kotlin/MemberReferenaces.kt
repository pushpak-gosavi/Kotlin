fun main() {
    val personList = listOf(
        PersonInfo(name = "Pushpak", age = 29, male = true),
        PersonInfo(name = "Sakshi", age = 22, male = false),
        PersonInfo(name = "Sangram", age = 27, male = true),
        PersonInfo(name = "Gaurav", age = 26, male = true),
        PersonInfo(name = "Ayushi", age = 28, male = false)
    )

//    personList.filter { personInfo ->
//        personInfo.male
//    }.forEach { personInfo ->
//        println(personInfo.name)
//    }
//
//    personList.filter { personInfo ->
//        !personInfo.male
//    }.forEach { personInfo ->
//        println(personInfo.name)
//    }

    //   personList.filter(PersonInfo::male).forEach { println(it.name) }
    //   personList.filterNot(PersonInfo::male).forEach { println(it.name) }

//    println(personList.any(PersonInfo::importatnt))
//    println(personList.any(::importatnt2))


    val animalListname = listOf("Dog", "Cat")
    // Referance function :: 
    println(animalListname.mapIndexed(::AnimalName))

    //belows is the logest code of the Refereance funcion
    println(animalListname.mapIndexed{index, name ->
        AnimalName(index = index, name = name)
    })
}

fun PersonInfo.importatnt() = this.name.startsWith(prefix = "P") && age > 27
fun importatnt2(personInfo: PersonInfo) = personInfo.name.startsWith(prefix = "P") && personInfo.age > 27

data class PersonInfo(
    val name: String,
    val age: Int,
    val male: Boolean
)

data class AnimalName(
    val index: Int,
    val name: String
)
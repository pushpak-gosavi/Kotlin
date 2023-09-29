fun main() {
    val animalMap = mapOf(
        "Tiger" to "Orange",
        "Wheal" to "Blue",
        "Monkey" to "Brown"
    )

    //println(animalMap)

    //println(animalMap.keys)
    //println(animalMap.values)

    //println(animalMap.getOrDefault(key="Tiger" , defaultValue = "Black"))
    //println(animalMap.getOrDefault(key = "Dog", defaultValue = "Black"))

    val animalList = listOf("Tiger", "Wheal")
    println(animalList)
    println(animalList.associateBy { it })

    val tiger = Animal(name = "Tiger", age = 4)
    val wheal = Animal(name = "Wheal", age = 2)
    val monkey = Animal(name = "Monkey", age = 5)

    val animalClassList = listOf(tiger, wheal, monkey)
    //println(animalClassList)
    val animalClassMap = animalClassList.associateBy({ it.name }, { it.age })
    println(animalClassMap)
    println(animalClassMap.getValue("Tiger"))

    val mapFilter= animalClassMap.filter {
        it.value > 4
    }
    println(mapFilter)
}
class Animal(val name: String, val age: Int)
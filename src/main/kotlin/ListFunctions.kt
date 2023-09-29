fun main() {
    val first = listOf(1, 2, 3, 4)
    val second = listOf("a", "b", "c", "d")
    val zipResult = first.zip(second)
    println(zipResult)

    val (unzipFirst, unzipSecond) = zipResult.unzip()
    println(unzipFirst)
    println(unzipSecond)

    val thirdList = listOf(
        listOf(1, 2, 3, 4),
        listOf("a", "b", "c", "d"),
        listOf("x", "y", "z")
    )
    val resultFlatten = thirdList.flatten()
    println(resultFlatten)

    val personName = listOf("Pushpak", "Sangram", "Gaurav")
    val personAge = listOf(28, 27, 25)

    val people = personName.zip(personAge) { name, age ->
        PersonListClass(name = name, age = age)
    }
    println(people)

    val map = people.groupBy(PersonListClass::age)
    println(map)
    println(map[28])

    val map2 = people.associateWith(PersonListClass::name)
    println(map2)

    val map3 = people.associateBy(PersonListClass::name)
    println(map3)

    println(map3.keys)
    println(map3.values)

    println(map3.getOrDefault(key = "Pushpak123", defaultValue = "Unknown"))
    val mulateblMap = map3.toMutableMap()
    println(mulateblMap)
    println(mulateblMap.getOrPut(key = "Pushpak123", { PersonListClass(name = "Pushpak123", age = 123) }))
    println(mulateblMap)

    val filterMap = map3.filterKeys { it.startsWith(prefix = "P") }
    println(filterMap)

    val resultTransform = map3.map { (_, value) ->
        "\"${value.name}\"" + "=${value.age}"
    }
    println(resultTransform)
}

data class PersonListClass(
    val name: String,
    val age: Int
)
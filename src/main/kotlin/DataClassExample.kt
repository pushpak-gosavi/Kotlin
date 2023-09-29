fun main() {
    val personData = PersonData(name = "Pushpak", age = 28)
    val personData2 = PersonData(name = "Pushpak", age = 28)
    println(personData.name)
    println(personData.age)
    println(personData.equals(personData2))


    // Destructor
    val (name, age) = personData
    println(name)
    println(age)
}

data class PersonData(
    val name: String,
    val age: Int
)
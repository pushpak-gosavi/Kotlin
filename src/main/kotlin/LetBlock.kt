fun main(){
    val person: PersonDataClass? by lazy { PersonDataClass(name = "Pushpak", age = 30) }
    println(person)
    person?.let {person ->
       println(person.name)

    }
    println(person?.name)
    println(person)

}
data class PersonDataClass(
    val name:String,
    val age:Int
)
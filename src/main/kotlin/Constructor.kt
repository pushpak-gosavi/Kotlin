fun main(){
   // val objPerson = PersonName("Ayushi")
    val objPersonTwo = PersonName(name = "Ayushi", age = 29)
}
class PersonName(
    val name:String
){
    init {
        println("Hello $name")
    }

    /**
     * In secondary Constructor must need to add the primary constructor
     * and is not access the val/var while declaring the secondary constructor
     */
    constructor(name: String, age:Int) : this(name){
        println("This is from secondary constructor")
        println("$name age is $age")
    }

    /**
     * Init block is always execute befor the constructor
     */
    init {
        println("Second Init")
    }
}
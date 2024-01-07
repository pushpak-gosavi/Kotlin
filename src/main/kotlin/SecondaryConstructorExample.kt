fun main (){

    val personInfoData = PersonInfoData(name = "Pushpak")
    val personInfoData2= PersonInfoData(name = "Sangram", age = 20)

}

class PersonInfoData( val name:String){
    init  {
        println("this is example of Inti Block $name")
    }
    fun private(){
        println("name is  $name")
    }
    init {
        println("This is Secondary Inti Block")
    }

    constructor (name: String, age:Int) :this(name){
        println("This is from secondary Constructor name= $name and age= $age")
    }


}
fun main(){
    println(CompanionObjectExample.getName())  // wihout creating the instance of the class we can access the comanion object
    println(CompanionObjectExample().getNameFun)
}

class CompanionObjectExample {
    var outerIncriment = 0
    val getNameFun = getName()
    companion object{
        fun getName()="My name is Pushpak."
        var incriment = 0
    }
}
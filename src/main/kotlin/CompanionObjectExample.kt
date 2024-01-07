fun main(){
    println(CompanionObjectExample.getName())  // wihout creating the instance of the class we can access the comanion object
    println(CompanionObjectExample().getNameFun)
    CompanionObjectExample.incriment++
    println(CompanionObjectExample.incriment++)
    println(CompanionObjectExample().outerIncriment)
}

class CompanionObjectExample {
    var outerIncriment = incriment
    val getNameFun = getName()
    companion object{
        fun getName()="My name is Pushpak."
        var incriment = 0
    }
}
fun main(){
    val dogChild = DogChild(name = "July")
    println(dogChild.energy)
    dogChild.eat()
    println(dogChild.energy)
}

open class AnimalParent(val name:String){
    var energy = 0
   open fun eat(){
        energy +=1
    }
    open fun run(){
        energy -=1
    }
}

class DogChild(name:String): AnimalParent(name){
    override fun eat() {
        energy += 5
    }

    override fun run() {
        energy -= 5
    }
}
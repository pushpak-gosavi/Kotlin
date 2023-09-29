fun main(){
    val dogChind = _DogChild()
    val catChild= _CatChild()

    getAnimalfun(dogChind)
    getAnimalDownCast(animalParent = dogChind)

}
// Upcasting
fun getAnimalfun(animalParent: _AnimalParent){
    animalParent.eat()
}

//downcasting
fun getAnimalDownCast(animalParent: _AnimalParent){
    if(animalParent is _DogChild){
        animalParent.cathing()
    }
}
interface _AnimalParent{
    fun eat()
    fun run()
}

class _DogChild: _AnimalParent{
    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

    fun cathing(){
        println("${this::class.qualifiedName} is cathing the ball...")
    }

}

class _CatChild: _AnimalParent{
    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

    fun scratching(){
        println("${this::class.qualifiedName} is Scathing...")
    }
}
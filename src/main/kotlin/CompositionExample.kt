fun main(){
    val animalCom = AnimalCom()
    val robot = Robot()

    val resultCom = RobotDog(animalCom = animalCom, robot = robot)
    resultCom.getBreak
}

class AnimalCom{
    fun bark(){
        println("Dog is barking")
    }
    fun run(){
        println("dog is running")
    }
}

class Robot{
    fun power(){
        println("Robot need power")
    }
}

class RobotDog(val animalCom: AnimalCom, val robot: Robot){
    val getBreak = animalCom.bark()
}
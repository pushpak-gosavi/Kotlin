package exception

import java.io.File


fun main() {
    //CheckException(name = "Pushpak 123456789012345", age = 20)
    //writeToFile()
    multiplayNumber(number = null)
}

fun writeToFile(){
    val file= File("Pushpak.txt")
    check(file.exists()){
        "${file.name} is not exist"
    }
    file.writeText("Everything is fine")
}

fun multiplayNumber(number:Int?):Int{
    requireNotNull(value = number){
        "We need a non nun number"
    }
    return number * 10
}

data class CheckException(
    val name: String,
    val age: Int
) {
    init {
        require(name.length < 20) {
            "name is too Long"
        }
    }
}
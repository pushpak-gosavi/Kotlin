fun main() {
    val hdd = Laptop(model = "DELL").HardDrive(storage = 100)
    hdd.getInfo()
    hdd.getStorage()
}

class Laptop(private val model: String) {
    inner class HardDrive(private val storage: Int) {
        fun getInfo() {
            println(this@Laptop.model)
        }

        fun getStorage() {
            println("Laptop model is $model and Storage is  $storage")
        }
    }
}
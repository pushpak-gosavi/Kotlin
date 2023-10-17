package exception

fun main() {
    CheckException(name = "Pushpak 123456789012345", age = 20)
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
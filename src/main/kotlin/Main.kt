fun main() {
   //displayText(text = "Pushpak")
    reverseString(text = "Pushpak")
}

fun displayText(text:String){
    var i = 0
    while (i < text.length){
        println(text[i])
        i++
    }
}
fun reverseString(text:String){
    for(i in text.length-1 downTo 0){
        print(text[i])
    }
}
package programs

fun main(){
    println(reverseString(name = "Pushpak"))
    println(reverseString(name = "Sangram"))
}
private fun reverseString(name:String):String{
    var reverseName=""
    for(i in name.length-1 downTo 0){
        reverseName += name[i]
    }
    return reverseName
}
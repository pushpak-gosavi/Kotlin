package programs

import java.util.Hashtable

fun main(){
    var hashMap: HashMap<String, String> = HashMap<String, String>()
    hashMap.put("Hello", "hello")
    hashMap.put("Hello", "not hello")
    hashMap.put("null", "one")

    println(hashMap)

    println(hashMap?.get("Hello"))

    val push:String? = null
    println(push?.length ?: 3)

    val hashtable: Hashtable<String, String> = Hashtable<String,String>()
    hashtable.put("pushpak", "Gosavi")
    hashtable.put("Ayushi", "Gosavi")
    hashtable.put("Ayushi", "Bharti")

    println(hashtable.get("pushpak"))
   println(hashtable.get("Ayushi"))


    println(hashtable)
}

data class Same (val s:String)
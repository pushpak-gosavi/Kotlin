fun main() {
//    val peron= Person()
//    println(peron.age)
//    peron.age = 20
//    println(peron.age)
//    val person= Person()
//    println(person.age)
//    println(person.age)
//    println(person.age)
    val person=Person(age = 17)
    println(person.isMinor)
    val person2=Person(age = 19)
    println(person2.isMinor)
}
//class Person(){
//    var age=0
//        set(value) { field= value}
//        get(){return field}
//}

//class Person{
//    private var incriment=0
//    val age:Int
//        get() = ++incriment
//}

class Person(val age: Int) {
     val isMinor
        get() = age < 18
}
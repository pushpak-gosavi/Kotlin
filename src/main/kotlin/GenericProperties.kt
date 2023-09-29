fun main(){
    val nameLength = "Pushpak"
    println(nameLength.shortOrLong)
    println(nameLength.getFirst())

    val genericList= listOf(1,2,3)
    println(genericList.getFirstOrNull)
    val genericList2 = listOf<Int>()
    println(genericList2.getFirstOrNull)
}

val String.shortOrLong
    get() = if(length > 10) "Long" else "Short"

fun String.getFirst() = if(length>1) this.get(0) else "Length is not enhough"

val <T>List<T>.getFirstOrNull : T?
    get() = if(isEmpty()) null else get(0)
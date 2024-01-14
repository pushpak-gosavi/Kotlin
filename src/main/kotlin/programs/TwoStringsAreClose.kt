fun main() {
    val word1 = "abccc"
    val word2 = "cccba"
    println(closeStrings(word1 = word1, word2 = word2))
}

fun closeStrings(word1: String, word2: String): Boolean {
/*    var checkStrings = false
//    var map1 = mutableMapOf<Char,Int>()
//    var map2 = mutableMapOf<Char, Int>()
//
//    for(i in word1.indices){
//        map1[word1[i]]= map1.getOrDefault(word1[i], 0)+1
//        map2[word2[i]] = map2.getOrDefault(word2[i], 0)+1
//    }

//    for (i in map1){
//        if (map1.get(key = i) == map2.get(key = i)){
//
//        }
//    }
//
//    map1['a']

//    var check = false
//    if (word1.length == word2.length) {
//        for (i in word1) {
//            if (word2.contains(i)) {
//                check = true
//            } else {
//                check = false
//                break
//            }
//        }
//    }
//
    if(word1.length!=word2.length)
        return false
    val wordCountChar = word1.groupBy { it }.mapValues { it.value.size }
    val word2CountChar = word2.groupBy { it }.mapValues { it.value.size }

    if (wordCountChar.keys !=word2CountChar.keys)
        return false
    println(wordCountChar)
    println(word2CountChar)

    val wordOneCountOfCharsCount = wordCountChar.values.groupBy { it }.mapValues { it.value.size }
    val wordTwoCountOfCharCount = word2CountChar.values.groupBy { it }.mapValues { it.value.size }

    println(wordOneCountOfCharsCount)
    println(wordTwoCountOfCharCount)
    return  wordOneCountOfCharsCount == wordTwoCountOfCharCount*/
    if(word1.length!=word2.length)
        return false
    val wordOneChar = word1.groupBy { it }.mapValues { it.value.size }
    val wordTwoChar = word2.groupBy { it }.mapValues { it.value.size }
    println(wordOneChar)
    println(wordTwoChar)
    if (wordOneChar.keys != wordTwoChar.keys)
        return false
    val getCharOneCount = wordOneChar.values.groupBy { it }.mapValues { it.value.size }
    val getCharTwoCount = wordTwoChar.values.groupBy { it }.mapValues { it.value.size }
    println(getCharOneCount)
    println(getCharTwoCount)
    return getCharOneCount == getCharTwoCount
}
package practices.strings

fun isStringPermutationOfTheSecond(string1: String, string2: String): Boolean {
    val map1 = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()

    string1.forEachIndexed { _, c ->
        if (map1.containsKey(c)) {
            val count = map1[c]!!
            map1[c] = count
        } else {
            map1[c] = 1
        }
    }

    string2.forEachIndexed { _, c ->
        if (map2.containsKey(c)) {
            val count = map2[c]!!
            map2[c] = count
        } else {
            map2[c] = 1
        }
    }

    if (map1.size == map2.size) {
        val value1 = map1.values
        val value2 = map2.values
        return value2.containsAll(value1)
    }
    return false
}
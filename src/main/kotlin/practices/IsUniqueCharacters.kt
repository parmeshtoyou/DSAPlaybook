package practices

class IsUniqueCharacters {
    fun isUniqueChars(string: String): Boolean {
        val arrayOfBoolean = BooleanArray(256)

        for (char in string) {
            if (arrayOfBoolean[char.code]) return false
            arrayOfBoolean[char.code] = true
        }
        return true
    }
}

fun main() {
    println(IsUniqueCharacters().isUniqueChars("Parmesh"))
}
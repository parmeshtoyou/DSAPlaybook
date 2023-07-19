package leetcode.july

class RomanNumber {

    fun romanToInt(s: String): Int {
        val mapOfSymbols = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var result = 0
        for(i in 0 until s.length ) {
            if ((i + 1) < s.length && mapOfSymbols.getOrDefault(s[i], 0) < mapOfSymbols.getOrDefault(s[i+1], 0)) {
                result -= mapOfSymbols.getOrDefault(s[i], 0)
            } else {
                result += mapOfSymbols.getOrDefault(s[i], 0)
            }
        }

        return result
    }
}
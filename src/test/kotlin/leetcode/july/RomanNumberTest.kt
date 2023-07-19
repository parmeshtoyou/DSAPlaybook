package leetcode.july

import org.junit.Test

import org.junit.Assert.*

class RomanNumberTest {

    @Test
    fun romanToInt() {
        val romanNumber = RomanNumber()
        val result = romanNumber.romanToInt("III")
        assertEquals(3, result)
        assertEquals(6, romanNumber.romanToInt("VI"))
        assertEquals(58, romanNumber.romanToInt("LVIII"))
        assertEquals(1994, romanNumber.romanToInt("MCMXCIV"))
    }
}
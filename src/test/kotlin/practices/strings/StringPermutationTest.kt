package practices.strings

import org.junit.Test

import org.junit.Assert.*

class StringPermutationTest {

    @Test
    fun isStringPermutationOfTheSecond() {
        assertTrue(isStringPermutationOfTheSecond("abcd", "dacb"))
        assertTrue(isStringPermutationOfTheSecond("geeksforgeeks", "forgeeksgeeks"))
        assertFalse(isStringPermutationOfTheSecond("allergy", "allergic"))
    }
}
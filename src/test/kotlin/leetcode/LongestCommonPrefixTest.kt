package leetcode


import junit.framework.TestCase.assertEquals
import org.junit.Test

class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix() {
        val l1 = LongestCommonPrefix()

        val inputArray = arrayOf("flower", "flow", "flip")
        assertEquals("fl", l1.longestCommonPrefix(inputArray))

        val inputArray1 = arrayOf("book", "boots", "bool")
        assertEquals("boo", l1.longestCommonPrefix(inputArray1))

        val inputArray2 = arrayOf("ram", "mohan", "param")
        assertEquals("", l1.longestCommonPrefix(inputArray2))
    }
}
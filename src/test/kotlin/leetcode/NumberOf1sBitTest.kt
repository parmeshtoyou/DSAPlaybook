package leetcode

import org.junit.Test

import org.junit.Assert.*

class NumberOf1sBitTest {

    @Test
    fun hammingWeight() {
        val result = leetcode.random.hammingWeight(15)
        assertEquals(4, result)
    }
}
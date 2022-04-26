package leetcode

import org.junit.Test

import org.junit.Assert.*

class MissingNumberTest {

    @Test
    fun missingNumber() {
        assertEquals(2, missingNumber(intArrayOf(3,0,1)))
        assertEquals(8, missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
    }
}
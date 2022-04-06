package leetcode

import org.junit.Test

import org.junit.Assert.*

class ContainsDuplicateTest {

    @Test
    fun containsDuplicate() {
        assertTrue(containsDuplicate(intArrayOf(1,2,3,1)))
        assertFalse(containsDuplicate(intArrayOf(1,2,3,4)))
        assertTrue(containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
    }
}
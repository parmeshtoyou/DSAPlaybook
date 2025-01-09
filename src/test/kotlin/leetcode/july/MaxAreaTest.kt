package leetcode.july

import leetcode.year2024.july.MaxArea
import org.junit.Test

import org.junit.Assert.*

class MaxAreaTest {

    @Test
    fun maxArea() {
        assertEquals(49, MaxArea().maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
        assertEquals(1, MaxArea().maxArea(intArrayOf(1,1)))
    }
}
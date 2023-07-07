package leetcode.july

import org.junit.Assert
import org.junit.Test

class MinimumSizeSubArraySumTest {

    @Test
    fun minSubArrayLenCase1() {
        val obj = MinimumSizeSubArraySum()
        val result = obj.minSubArrayLen(nums = intArrayOf(2,3,1,2,4,3), target = 7)
        Assert.assertEquals(2, result)
    }

    @Test
    fun minSubArrayLenCase2() {
        val obj = MinimumSizeSubArraySum()
        val result = obj.minSubArrayLen(nums = intArrayOf(1,4,4), target = 4)
        Assert.assertEquals(1, result)
    }

    @Test
    fun minSubArrayLenCase3() {
        val obj = MinimumSizeSubArraySum()
        val result = obj.minSubArrayLen(nums = intArrayOf(1,1,1,1,1,1,1,1), target = 11)
        Assert.assertEquals(0, result)
    }
}
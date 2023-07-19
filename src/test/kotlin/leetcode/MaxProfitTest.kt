package leetcode

import org.junit.Test

import org.junit.Assert.*

class MaxProfitTest {

    @Test
    fun maxProfit() {
        //assertEquals(0, maxProfit(intArrayOf(7,6,4,3,1)))
        //assertEquals(5, maxProfit(intArrayOf(7,1,5,3,6,4)))
        assertEquals(7, maxProfit(intArrayOf(6,5,3,7,1,4)))
    }

    @Test
    fun maxProfitV2() {
        //assertEquals(0, maxProfitV2(intArrayOf(7,6,4,3,1)))
        assertEquals(7, maxProfit3(intArrayOf(6,5,3,7,1,4)))
    }
}
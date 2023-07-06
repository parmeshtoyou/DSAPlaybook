package leetcode.july

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Test


class MergeTwoArraysTest {

    @Test
    fun testMergeCase1() {
        val nums1 = intArrayOf(1,2,3,0,0,0)
        val nums2 = intArrayOf(2,5,6)
        val m = 3
        val n = 3
        val mergeTwoArrays = MergeTwoArrays()
        mergeTwoArrays.merge(nums1, m, nums2, n)
        assertArrayEquals(nums1, intArrayOf(1,2,2,3,5,6))
    }

    @Test
    fun testMergeCase2() {
        val nums1 = intArrayOf(1)
        val nums2 = intArrayOf()
        val m = 1
        val n = 0
        val mergeTwoArrays = MergeTwoArrays()
        mergeTwoArrays.merge(nums1, m, nums2, n)
        assertArrayEquals(nums1, intArrayOf(1))
    }

    @Test
    fun testMergeCase3() {
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)
        val m = 0
        val n = 1
        val mergeTwoArrays = MergeTwoArrays()
        mergeTwoArrays.merge(nums1, m, nums2, n)
        assertArrayEquals(nums1, intArrayOf(1))
    }
}
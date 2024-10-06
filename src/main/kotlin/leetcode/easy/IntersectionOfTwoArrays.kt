package leetcode.easy

//https://leetcode.com/problems/intersection-of-two-arrays/description/

class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableSetOf<Int>()
        val set1 = mutableSetOf<Int>()
        for(n in nums1) {
            set1.add(n)
        }

        for(m in nums2) {
            if(set1.contains(m)) {
                result.add(m)
            }
        }

        return result.toIntArray()
    }
}
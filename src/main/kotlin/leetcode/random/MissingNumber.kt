package leetcode.random

fun missingNumber(nums: IntArray): Int {
    val n = nums.size
    val sumOfAllN = n * (n+1)/2
    return sumOfAllN - nums.sum()
}
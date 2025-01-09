package leetcode.random

fun containsDuplicate(nums: IntArray): Boolean {
    val numSet = HashSet<Int>()
    for(n in nums) {
        if(numSet.contains(n)) {
            return true
        } else {
            numSet.add(n)
        }
    }
    return false
}
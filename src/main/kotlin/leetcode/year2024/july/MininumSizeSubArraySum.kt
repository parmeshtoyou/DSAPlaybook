package leetcode.year2024.july

class MinimumSizeSubArraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var result = Int.MAX_VALUE
        var sum = 0
        var start = 0
        for (end in nums.indices) {
            sum += nums[end]
            while (sum >= target) {
                val currentMinSize = end - start + 1
                result = result.coerceAtMost(currentMinSize)
                sum -= nums[start]
                start++
            }
        }
        return if(result == Int.MAX_VALUE) {
            0
        } else {
            result
        }
    }
}
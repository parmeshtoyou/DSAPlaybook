package leetcode.easy

class NumberOfGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        val mapOfOccurance = mutableMapOf<Int, Int>()

        for(n in nums) {
            if(mapOfOccurance.contains(n)) {
                val existingOccurance = mapOfOccurance[n]!!
                mapOfOccurance[n] = existingOccurance + 1
            } else {
                mapOfOccurance[n] = 1
            }
        }

        var numberOfPairs = 0

        mapOfOccurance.values.forEach { value ->
            numberOfPairs += (value * (value - 1)) / 2
        }

        return numberOfPairs
    }
}
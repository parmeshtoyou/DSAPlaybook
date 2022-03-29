package leetcode

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/
class CountOdds {
    // Approach 1: Time Complexity is N where N is the number of Items withing the range
    fun countOdds1(low: Int, high: Int): Int {
        var count = 0
        for (i in low..high) {
            if (i % 2 != 0) count++
        }
        return count
    }

    fun countOdds2(low: Int, high: Int): Int {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2
        } else {
            return (high - low) / 2 + 1
        }
    }
}

fun main() {
    val result1 = CountOdds().countOdds1(3, 7) //min 0, max=10^9
    val result2 = CountOdds().countOdds2(1, 9) //min 0, max=10^9
    println(result1)
    println(result2)
}
package leetcode

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/
class CountOdds {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0
        for(i in low .. high) {
            if(i%2 != 0) count++
        }
        return count
    }
}

fun main() {
    val result = CountOdds().countOdds(3, 7) //min 0, max=10^9
    println(result)
}
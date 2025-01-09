package leetcode.random

//https://leetcode.com/problems/palindrome-number/
class PalindromeNumber {
    //Plan A
    fun isPalindrome1(x: Int): Boolean {
        if (x < 0 || x == Int.MAX_VALUE) return false
        var n = x
        val numList = mutableListOf<Int>()
        while (n > 0) {
            numList.add(n % 10)
            n /= 10
        }
        var reverseNum = 0.0

        numList.forEachIndexed { i, num ->
            if (i > 1) {
                reverseNum = reverseNum * 10 + num
            } else {
                reverseNum = reverseNum * 10 * i + num
            }
        }
        return reverseNum.toInt() == x
    }

    // Plan B
    fun isPalindrome2(x: Int): Boolean {
        if (x < 0 || x == Int.MAX_VALUE) return false

        var y = x
        var temp = 0

        while (y > 0) {
            temp = (temp * 10) + (y % 10)
            y /= 10
        }

        return x == temp
    }
}

fun main() {
    println(PalindromeNumber().isPalindrome1(2147483647))
    println(PalindromeNumber().isPalindrome2(1234321))
}
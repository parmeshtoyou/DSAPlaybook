package leetcode.easy

//https://leetcode.com/problems/number-of-1-bits/
class NumberOf1Bits {
    fun hammingWeight(n: Int): Int {
        val binaryString = n.toString(2)
        var count = 0
        for(ch in binaryString) {
            if(ch == '1') {
                count++
            }
        }
        return count
    }
}
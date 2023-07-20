package leetcode.july

class MaxArea {

    fun maxArea(height: IntArray): Int {
        var water = 0
        var left = 0
        var right = height.size - 1

        while(left < right) {
            water = max(water, min(height[left], height[right]) * (right-left))
            if(height[left] < height[right]){
                left++
            } else {
                right--
            }
        }

        return water
    }

    private fun min(num1: Int, num2: Int): Int {
        return if(num1 < num2) {
            num1
        } else {
            num2
        }
    }

    private fun max(num1: Int, num2: Int): Int {
        if(num1 > num2) {
            return num1
        } else {
            return num2
        }
    }
}
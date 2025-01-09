package leetcode.random

class RotateArray {
    fun rotateArray(intArray: IntArray, k: Int): IntArray {
        val newKey = k % intArray.size

        //step 1: reverse this array
        reverseArray(intArray, 0, intArray.size - 1)
        //step 2: rotate 0 to k-1
        reverseArray(intArray, 0, newKey - 1)
        //step 3: rotate k to n-1
        reverseArray(intArray, newKey, intArray.size - 1)
        return intArray
    }

    private fun reverseArray(intArray: IntArray, startIndex: Int, endIndex: Int) {
        var sIndex = startIndex
        var eIndex = endIndex
        while (sIndex < eIndex) {
            val left = intArray[sIndex]
            val right = intArray[eIndex]
            intArray[sIndex] = right
            intArray[eIndex] = left
            sIndex++
            eIndex--
        }
    }
}

package leetcode.july

class ReArrangeMatrix {

    fun rearrangeMatrix(m: Array<IntArray>): Array<IntArray> {
        val freqMap = mutableMapOf<Int, Int>()
        val n = m.size

        // Step 1: Count frequency of numbers in m
        for (i in 0 until n) {
            for (j in 0 until n) {
                val num = m[i][j]
                freqMap[num] = freqMap.getOrDefault(num, 0) + 1
            }
        }

        // Step 2: Sort map entries by frequency and values
        val sortedNums = freqMap.entries.sortedWith(compareBy({ it.value }, { it.key }))

        // Step 3: Extract sorted numbers from the map
        val sortedValues = sortedNums.map { it.key }.toIntArray()

        // Step 4: Create a new matrix
        val result = Array(n) { IntArray(n) }

        // Step 5: Start at bottom-right element
        var i = n - 1
        var j = n - 1
        var index = 0

        // Step 6: Place sorted numbers diagonally
        while (i >= 0 && j >= 0) {
            result[i][j] = sortedValues[index]
            index++

            if (i == 0 || j == 0) {
                break
            }

            i--
            j--
        }

        return result
    }

}
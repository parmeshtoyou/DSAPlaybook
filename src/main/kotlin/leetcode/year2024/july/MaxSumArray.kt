package leetcode.year2024.july

class MaxSumArray {
    fun solution(intArray: IntArray) {
        val mainList = mutableListOf<MutableList<Int>>()
        for (start in intArray.indices) {
            for (end in start until intArray.size) {
                val subArray = intArray.sliceArray(start..end)
                println("subArray:${subArray.joinToString()}")
                mainList.add(subArray.toMutableList())
            }
        }
        var max = Int.MIN_VALUE
        var maxArray = mutableListOf<Int>()
        mainList.forEach {
            val maxSum = it.fold(0) { a, b ->
                a + b
            }
            if (maxSum > max) {
                max = maxSum
                maxArray = it
            }
        }
        println(max)
        println("maxArray:$maxArray")
    }

    fun solution2(intArray: IntArray) {
        
    }
}

fun main() {
    val sumArray = MaxSumArray()
    sumArray.solution(intArrayOf(-5, 4, 6, -3, 4, -1))
}
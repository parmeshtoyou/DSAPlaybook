package practices

import kotlin.math.abs

class DiagonalDifference {
    fun solution(array: Array<IntArray>): Int {
        var leftToRight = 0
        var rightToLeft = 0

        val rows = array.size
        val column = array[0].size

        var i = 0
        var j = 0
        var k = 0
        var l = array[0].size - 1

        while (i < rows && j < column && k < rows && l >= 0) {
            leftToRight += array[i][j]
            rightToLeft += array[k][l]
            i++
            j++
            k++
            l--
        }
        return abs(leftToRight - rightToLeft)
    }
}

fun main() {
    val array: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(9, 8, 9))
    println(DiagonalDifference().solution(array))
}
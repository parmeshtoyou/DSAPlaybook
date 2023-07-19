package leetcode.july

import org.junit.Test

import org.junit.Assert.*

class ReArrangeMatrixTest {

    @Test
    fun rearrangeMatrix() {
        val obj = ReArrangeMatrix()
        val m = arrayOf(
            intArrayOf(1,4,-2),
            intArrayOf(-2,3,4),
            intArrayOf(3,1,3)
        )

        val result = obj.rearrangeMatrix(m)
        for (row in result) {
            println(row.joinToString(" "))
        }
    }
}
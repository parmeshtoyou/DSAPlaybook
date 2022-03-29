package practices

import org.junit.Test

import org.junit.Assert.*

class DiagonalDifferenceTest {

    @Test
    fun solution() {
        val expected = 2
        val array: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(9, 8, 9))
        val actual = DiagonalDifference().solution(array)
        assertEquals(expected, actual)
    }
}
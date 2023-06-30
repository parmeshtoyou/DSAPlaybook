package leetcode

import org.junit.Test

import org.junit.Assert.*

class RotateArrayTest {

    @Test
    fun rotateArray() {
        val rotation = RotateArray()
        val result = rotation.rotateArray(intArrayOf(1,2,3,4,5,6,7), 3)
        assertArrayEquals(result, intArrayOf(5,6,7,1,2,3,4))
        assertArrayEquals(rotation.rotateArray(intArrayOf(-1,-100,3,99), 2), intArrayOf(3,99,-1,-100))
        assertArrayEquals(rotation.rotateArray(intArrayOf(-1), 2), intArrayOf(-1))
        assertArrayEquals(rotation.rotateArray(intArrayOf(1,2), 5), intArrayOf(2,1))
        assertArrayEquals(rotation.rotateArray(intArrayOf(1,2,3), 4), intArrayOf(3,1,2))
    }
}
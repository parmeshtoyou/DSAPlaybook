package dsa.searching

import org.junit.Test

import org.junit.Assert.*

class BinarySearchKtTest {

    @Test
    fun binarySearch() {
        assertEquals(-1, binarySearch(intArrayOf(1,4,5,6,2,3,5,7), 10))
        assertEquals(4, binarySearch(intArrayOf(1,4,5,6,2,3,5,7), 5))
    }
}
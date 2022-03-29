package practices.hashing

import org.junit.Test

import org.junit.Assert.*

class CountDistinctNumberTest {

    @Test
    fun solution() {
        val actual = CountDistinctNumber().solution(intArrayOf(5, 10, 15, 5, 4, 5))
        assertEquals(4, actual)
    }
}
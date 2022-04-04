package practices

import org.junit.Test

import org.junit.Assert.*

class FibonacciByRecursionTest {

    @Test
    fun fibonacci() {
        val expectedList = mutableListOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
        val actualList = mutableListOf<Int>()
        val n = 10

        for (i in 0 until n) {
            actualList.add(fibonacci(i))
        }

        assertEquals(expectedList.toList(), actualList.toList())
    }

    @Test
    fun fibonacci2() {
        val expectedList = mutableListOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
        val actualList = mutableListOf<Int>()
        val n = 10

        for (i in 0 until n) {
            actualList.add(fibonacci2(i))
        }

        assertEquals(expectedList.toList(), actualList.toList())
    }

}
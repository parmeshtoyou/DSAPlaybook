package sorting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class BubbleSortTest {

    @Test
    fun bubbleSort() {
        val input = arrayOf(5, 4, 3, 2, 5, 1)
        val expected = arrayOf(1, 2, 3, 4, 5, 5)

        val actual = bubbleSort(input)
        assertThat(actual).isEqualTo(expected)
    }
}
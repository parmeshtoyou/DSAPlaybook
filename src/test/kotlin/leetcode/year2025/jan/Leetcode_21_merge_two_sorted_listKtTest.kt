package leetcode.year2025.jan

import org.junit.Assert
import org.junit.Test

class Leetcode_21_merge_two_sorted_listKtTest {

    @Test
    fun solution() {
        val node1 = LList(1)
        val node2 = LList(2)
        val node3 = LList(4)
        node1.next = node2
        node2.next = node3

        val node4 = LList(1)
        val node5 = LList(3)
        val node6 = LList(4)

        node4.next = node5
        node5.next = node6

        var result = solution(node1, node4)
        val mutableList = mutableListOf<Int>()
        while (result != null) {
            mutableList.add(result.value)
            result = result.next
        }

        Assert.assertEquals(mutableList, mutableListOf(1, 1, 2, 3, 4, 4))
    }
}
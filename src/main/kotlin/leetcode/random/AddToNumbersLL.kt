package leetcode.random

import dsa.Node

//WIP
@Suppress("unused")
class AddToNumbersLL {
    fun addTwoNumbers(l1: Node?, l2: Node?): Node? {
        var currentOfL1 = l1
        var currentOfL2 = l2

        var newHead: Node? = null
        var carry = 0
        while(currentOfL1 != null || currentOfL2 != null) {
            print(currentOfL1?.value)

            val sum = carry + currentOfL1?.value!! + currentOfL2!!.value

            if (sum < 10) {
                val newNode = Node(sum)
                newNode.next = newHead
                newHead = newNode
            } else {
                carry = sum - 10
            }

            currentOfL1 = currentOfL1.next
            currentOfL2 = currentOfL2.next
        }
        return newHead
    }
}
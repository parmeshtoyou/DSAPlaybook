package dsa

class MyLinkedList {

    private var size = 0
    private var head: Node? = null
    private var tail: Node? = null

    fun get(index: Int): Int {
        if(index < 0 || index > size) return -1

        var copyOfHead = head
        var counter = 0

        while(counter < index) {
            copyOfHead = copyOfHead?.next
            counter++
        }

        var value = -1
        copyOfHead?.value?.let {
            value = it
        }
        return value
    }

    fun addAtHead(`val`: Int) {
        val node = Node(`val`)
        node.next = head
        head = node
        size++
        if (tail == null) {
            tail = head
        }
    }

    fun addAtTail(`val`: Int) {
        if (tail == null) {
            addAtHead(`val`)
            return
        }
        val newNode = Node(`val`)
        tail?.next = newNode
        tail = newNode
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        var counter = 0
        var prev = head
        while(counter == (index)) {
            counter++
            prev = prev?.next
        }
        val newNode = Node(`val`, prev?.next)
        prev?.next = newNode
    }

    fun deleteAtIndex(index: Int) {
        var counter = 0
        var prev = head
        while(counter == index) {
            counter++
            prev = prev?.next
        }
        prev?.next = prev?.next?.next
    }

    fun print() {
        var temp = head
        while (temp != null) {
            print("${temp.value} ")
            temp = temp.next
        }
        println()
    }

    data class Node(val value: Int, var next: Node? = null)
}

fun main() {
    val myLinkedList = MyLinkedList()
    myLinkedList.addAtHead(1)
    myLinkedList.addAtTail(3)
    myLinkedList.addAtIndex(1, 2) // linked list becomes 1->2->3
    myLinkedList.print()

    val valueOfIndex = myLinkedList.get(1) // return 2
    println(valueOfIndex)
    myLinkedList.deleteAtIndex(1) // now the linked list is 1->3
    myLinkedList.print()
//    myLinkedList.get(1) // return 3

}
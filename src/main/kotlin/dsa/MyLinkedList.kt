package dsa

//WIP
class MyLinkedList {
    var first: Node? = null

    private fun isEmpty() = first == null

    fun insertFirst(value: Int) {
        val newNode = Node(value)
        newNode.next = first
        first = newNode
    }

    fun insertLast(value: Int) {
        val endNode = Node(value)
        if (isEmpty()) {
            insertFirst(value)
            return
        }
        var n = first!!
        while (n.next != null){
            n = n.next!!
        }
        n.next = endNode
    }

    fun deleteFirst(): Node? {
        val temp = first
        first = first?.next
        return temp
    }

    fun getHead() = first

    fun displayList(head: Node?) {
        var current = head
        print("HEAD-->")
        while (current != null) {
            print("${current.value}-->")
            current = current.next
        }
        println("NULL")
    }

    fun find(key: Int): Node? {
        var current = first
        while (current?.value != key) {
            if (current?.next == null) { // reached at the end of the list, so not found the key
                return null
            } else {
                current = current.next // move on to the next node
            }
        }
        return current
    }

    fun delete(data: Int): Node? {
        var copyOfHead = first
        if (copyOfHead != null && copyOfHead.value == data) {
            first = first!!.next
            return first
        }

        while (copyOfHead!!.next != null) {
            if (copyOfHead.next!!.value == data) {
                copyOfHead.next = copyOfHead.next!!.next
                return first
            }
            copyOfHead = copyOfHead.next
        }
        return null
    }

    fun reverse(): Node? {
        var prev: Node? = null
        while (first != null) {
            val nextNode = first!!.next
            first?.next = prev
            prev = first
            first = nextNode
        }
        return prev
    }
}

fun main() {
    val myLinkedList = MyLinkedList()
    myLinkedList.insertFirst(10)
    myLinkedList.insertFirst(20)
    myLinkedList.insertFirst(30)
    myLinkedList.insertFirst(40)
    myLinkedList.insertFirst(50)
    myLinkedList.insertFirst(60)
    myLinkedList.insertFirst(70)

    myLinkedList.displayList(myLinkedList.getHead())

    val found = myLinkedList.find(50)
    found?.displayNode()

    myLinkedList.displayList(myLinkedList.getHead())

    myLinkedList.displayList(myLinkedList.getHead())

    myLinkedList.insertLast(80)
    myLinkedList.displayList(myLinkedList.getHead())

    myLinkedList.delete(50)
    myLinkedList.displayList(myLinkedList.getHead())

    myLinkedList.deleteFirst()
    myLinkedList.displayList(myLinkedList.getHead())

    println("reversed linked list")
    val newHead = myLinkedList.reverse()
    myLinkedList.displayList(newHead)

}
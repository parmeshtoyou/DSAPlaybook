package dsa

//WIP
class MyLinkedList {
    var first: Node? = null

    fun isEmpty() = first == null

    fun insertFirst(value: Int) {
        val newNode = Node(value)
        newNode.next = first
        first = newNode
    }

    fun deleteFirst(): Node? {
        val temp = first
        first = first?.next
        return temp
    }

    fun displayList() {
        var current = first
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

    fun delete(key: Int): Node? {
        var current = first
        var previous = first

        while (current?.value != key) {
            if (current?.next == null) {
                return null
            } else {
                previous = current
                current = current.next
            }
        }
        if (current == first) { // found node at first
            first = first?.next
        } else {
            previous?.next = current.next
        }
        return current
    }

}

fun main() {
//    val myLinkedList = MyLinkedList()
//    myLinkedList.addAtHead(1)
//    myLinkedList.addAtTail(3)
//    myLinkedList.addAtIndex(1, 2) // linked list becomes 1->2->3
//    myLinkedList.addAtIndex(2, 22) // linked list becomes 1->2->3
//    myLinkedList.addAtTail(4)
//    myLinkedList.print()
//
//    val valueOfIndex = myLinkedList.get(1) // return 2
//    println(valueOfIndex)
//    myLinkedList.deleteAtIndex(1) // now the linked list is 1->3
//    myLinkedList.print()

    val myLinkedList = MyLinkedList()
    myLinkedList.insertFirst(10)
    myLinkedList.insertFirst(20)
    myLinkedList.insertFirst(30)
    myLinkedList.insertFirst(40)
    myLinkedList.insertFirst(50)
    myLinkedList.insertFirst(60)
    myLinkedList.insertFirst(70)

    myLinkedList.displayList()

    val found = myLinkedList.find(50)
    found?.displayNode()

    val delete = myLinkedList.delete(40)
    delete?.displayNode()

    myLinkedList.displayList()


    println("Deleted...")
    while (myLinkedList.isEmpty().not()) {
        val removedItem = myLinkedList.deleteFirst()
        print("${removedItem?.value} ")
    }

    println()
    myLinkedList.displayList()
}
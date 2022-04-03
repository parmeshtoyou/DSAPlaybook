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

    fun displayList() {
        var current = first
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

    myLinkedList.displayList()

    val found = myLinkedList.find(50)
    found?.displayNode()

    myLinkedList.displayList()

    myLinkedList.displayList()

    myLinkedList.insertLast(80)
    myLinkedList.displayList()

    myLinkedList.delete(50)
    myLinkedList.displayList()

    myLinkedList.deleteFirst()
    myLinkedList.displayList()

}
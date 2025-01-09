package leetcode.year2025.jan

data class LList(
    val value: Int
) {
    var next: LList? = null
}

fun solution(list1: LList?, list2: LList?): LList? {

    // creating dummy node to compare and append items
    // into the list
    var current = LList(value = Int.MIN_VALUE)

    // head will remain fix at the starting of the list
    // we will return the next of this head to avoid
    // Int.MIN_VALUE from the result
    val head = current

    // create two mutable list from given list
    // as provided list are immutable
    var l1 = list1
    var l2 = list2

    while (l1 != null && l2 != null) {
        if (l1.value <= l2.value) {
            current.next = l1
            l1 = l1.next
        } else {
            current.next = l2
            l2 = l2.next
        }
        current = current.next!!
    }

    if (l1 != null) {
        current.next = l1
    }
    if (l2 != null) {
        current.next = l2
    }

    return head.next
}
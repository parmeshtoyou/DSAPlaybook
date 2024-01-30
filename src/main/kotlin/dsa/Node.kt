package dsa

data class Node(var value: Int, var next: Node? = null) {
    fun displayNode() {
        println(value)
    }
}

fun main() {
    val map = HashMap<Int, Int>()
    map[0] = 1
    map[1] = 7
    map[2] = -234
    map[3] = 8

    var result = Int.MIN_VALUE
    var resultIndex = -1
    map.entries.forEachIndexed { index, mutableEntry ->
        if(result < mutableEntry.value) {
            result = mutableEntry.value
            resultIndex = index + 1
        }
    }

    print(resultIndex)
}

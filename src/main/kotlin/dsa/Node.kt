package dsa

data class Node(var value: Int, var next: Node? = null) {
    fun displayNode() {
        println(value)
    }
}

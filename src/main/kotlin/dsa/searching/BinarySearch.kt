package dsa.searching

fun binarySearch(input: IntArray, target: Int): Int {
    var start = 0
    var end = input.size

    input.sort()

    while (start < end) {
        val middle = start + (end - start) / 2
        if (target == input[middle]) {
            return middle
        }
        if (target < input[middle]) {
            end = middle - 1
        } else {
            start = middle + 1
        }
    }
    return -1
}
package sorting

//sort the left half
//sort the right half
//merge both the half

fun main() {
    val input = intArrayOf(23, 47, 81, -1, 95, 7, 14, 39, 55, 63, 74)
    val temp = IntArray(input.size) { -1 }

    println("before sorting")
    for (i in input) {
        println(i)
    }

    mergeSort(input, temp)
    println("after sorting")
    for (i in input) {
        println(i)
    }
}

fun mergeSort(input: IntArray, temp: IntArray) {
    val start = 0
    val end = input.size - 1
    mergeSortRec(input, temp, start, end)
}

fun mergeSortRec(input: IntArray, temp: IntArray, lowerBound: Int, upperBound: Int) {

    if (lowerBound == upperBound) {
        return
    }
    val mid = lowerBound + (upperBound - lowerBound) / 2

    mergeSortRec(input, temp, lowerBound, mid)
    mergeSortRec(input, temp, mid + 1, upperBound)
    merge(input, temp, lowerBound, mid + 1, upperBound)
}

fun merge(input: IntArray, temp: IntArray, start: Int, middle: Int, upperBound: Int) {
    var j = 0
    val mid = middle - 1
    var highPtr = middle
    var lowPtr = start
    val size = upperBound - start + 1

    while (lowPtr <= mid && highPtr <= upperBound) {
        if (input[lowPtr] < input[highPtr]) {
            temp[j++] = input[lowPtr++]
        } else {
            temp[j++] = input[highPtr++]
        }
    }

    while (lowPtr <= mid) {
        temp[j++] = input[lowPtr++]
    }

    while (highPtr <= upperBound) {
        temp[j++] = input[highPtr++]
    }

    for (k in 0 until size) {
        input[start + k] = temp[k]
    }
}
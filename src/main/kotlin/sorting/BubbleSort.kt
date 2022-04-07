package sorting

// Time complexity is O(N*N)
fun bubbleSort(input: Array<Int>): Array<Int> {
    println("before sorting")

    for (i in input.indices) {
        for (j in input.indices) {
            if (input[i] < input[j]) {
                swap(i, j, input)
            }
        }
    }
    return input
}

fun swap(first: Int, second: Int, input: Array<Int>) {
    val temp = input[first]
    input[first] = input[second]
    input[second] = temp
}
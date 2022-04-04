package sorting

//sort the left half
//sort the right half
//merge both the half

fun main() {
    val arrayA = intArrayOf(23, 47, 81, 95)
    val arrayB = intArrayOf(7, 14, 39, 55, 63, 74)

    val arrayC = merge(arrayA, arrayB)

    for(element in arrayC) {
        println(element)
    }
}

fun merge(arrayA: IntArray, arrayB: IntArray) : IntArray {
    val arrayC = IntArray(arrayA.size + arrayB.size) { Int.MIN_VALUE }
    var indexA = 0
    var indexB = 0
    var indexC = 0

    // compare item from array A with array B and put smaller item into array C
    while(indexA < arrayA.size && indexB < arrayB.size) {
        if(arrayA[indexA] < arrayB[indexB]) {
            arrayC[indexC] = arrayA[indexA]
            indexC++
            indexA++
        } else {
            arrayC[indexC] = arrayB[indexB]
            indexC++
            indexB++
        }
    }

    // move all remaining item into array C, if there are any
    while(indexA < arrayA.size) {
        arrayC[indexC] = arrayA[indexA]
        indexA++
        indexC++
    }

    // move all remaining item into array C, if there are any
    while(indexB < arrayB.size) {
        arrayC[indexC] = arrayB[indexB]
        indexB++
        indexC++
    }

    return arrayC
}
package leetcode.twosum

//when the input is sorted
fun twoSum(input: IntArray, target: Int): IntArray {
    var start = 0
    var end = input.size - 1
    while (start < end) {
        if (input[start] + input[end] > target) {
            end--
        } else if (input[start] + input[end] < target) {
            start++
        } else {
            return intArrayOf(start + 1, end + 1);
        }
    }
    throw IllegalStateException("Not found")
}
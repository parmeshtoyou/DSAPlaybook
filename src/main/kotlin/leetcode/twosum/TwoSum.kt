package leetcode.twosum

//when the input is sorted
//fun twoSum(input: IntArray, target: Int): IntArray {
//    var start = 0
//    var end = input.size - 1
//    while (start < end) {
//        if (input[start] + input[end] > target) {
//            end--
//        } else if (input[start] + input[end] < target) {
//            start++
//        } else {
//            return intArrayOf(start + 1, end + 1);
//        }
//    }
//    throw IllegalStateException("Not found")
//}

fun twoSum() {
    val input = intArrayOf(2,7,11,15)
    val target = 9

    val map = HashMap<Int, Int>()
    input.forEachIndexed { index, i ->
        val diff = target - i
        if(map.containsKey(diff)) {
            val index1 = map.getOrDefault(diff, 0)
            print("index1:$index1, index2:$index")
        } else {
            map[diff] = index
        }
    }
}
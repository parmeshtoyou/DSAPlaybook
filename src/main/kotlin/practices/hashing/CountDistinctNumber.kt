package practices.hashing

class CountDistinctNumber {
    fun solution(input: IntArray): Int {

        val list = mutableListOf<Int>()

        for (i in 0..input.size - 1) {
            var flag = 0
            for (j in i + 1..input.size - 1) {
                if (input[i] == input[j]) {
                    flag = 1
                    break
                }
            }

            if (flag == 0) {
                list.add(input[i])
            }
        }
        return list.size
    }
}
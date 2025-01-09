package leetcode.random

fun hammingWeight(n: Int): Int {

    if (n == 0) return 0

    var num = n
    var count = 0
    while (num > 0) {
        if (num % 2 == 0) {
            num = num.shr(1)
        } else {
            count++
            num = num.shr(1)
        }
    }

    println(count)

    return count
}
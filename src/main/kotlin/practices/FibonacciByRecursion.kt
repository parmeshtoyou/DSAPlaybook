package practices

fun fibonacci(num: Int): Int {
    if (num < 2) return num
    return fibonacci(num - 1) + fibonacci(num - 2)
}

// With Recursion
fun fibonacci2(n: Int): Int {
    if (n == 0) return 0
    var a = 1
    var b = 1

    for (i in 3 .. n) {
        val c = a + b
        a = b
        b = c
    }
    return b
}
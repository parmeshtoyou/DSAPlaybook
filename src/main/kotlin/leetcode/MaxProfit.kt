package leetcode

fun maxProfit(prices: IntArray): Int {

    var max = 0

    for(i in 0 until prices.size) {
        for(j in i until prices.size) {
            if(prices[j] - prices[i] > max) {
                max = prices[j] - prices[i]
            }
        }
    }

    return max
}

fun maxProfitV2(prices: IntArray): Int {

    var max = 0
    var min = Int.MAX_VALUE

    for(i in 0 until prices.size) {
        if (prices[i] < min) {
            min = prices[i]
        } else if(prices[i] - min > max) {
            max = prices[i] - min
        }
    }

    return max
}

fun maxProfit3(costs: IntArray): Int {
    var maxProfit = 0
    var minBuy = costs[0]
    var max = 0
    for(i in 0 .. costs.size - 1) {
        val currentPrice = costs[i]
        maxProfit = max(currentPrice - minBuy, maxProfit)
        minBuy = min(currentPrice, minBuy)
        if(max < (maxProfit + minBuy)) {
            max = maxProfit + minBuy
        }
    }
    return max
}

fun max(n1: Int, n2: Int): Int {
    if(n1 > n2)
        return n1
    else
        return n2
}

fun min(n1: Int, n2: Int): Int {
    if(n1 < n2)
        return n1
    else
        return n2
}
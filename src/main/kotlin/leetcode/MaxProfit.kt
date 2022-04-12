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
class SolutionBestTimeToByAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for ((indice, value) in prices.withIndex()){
            if (indice == prices.size-1) break
            if (prices[indice+1] > prices[indice]){
                profit += prices[indice +1] - prices[indice]
            }
        }
        if (profit < 0)
            profit = 0
        return profit
    }
}

fun main(args: Array<String>) {
    val solution = SolutionBestTimeToByAndSellStock()
    var numArray = intArrayOf(7,1,5,3,6,4)
    numArray = intArrayOf(1,2,3,4,5)
    numArray = intArrayOf(7,6,4,3,1)
    println(solution.maxProfit(numArray))
}
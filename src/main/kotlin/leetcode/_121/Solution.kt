package leetcode._121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var maxSoFar = 0
        for (i in 1 until prices.size) {
            val tmp = max + (prices[i] - prices[i - 1])
            max = if (tmp > 0) tmp else 0
            maxSoFar = max.coerceAtLeast(maxSoFar)
        }
        return maxSoFar
    }
}

fun main() {
    val nums = intArrayOf(7, 6, 4, 3, 1)

    val solution = Solution()
    println(solution.maxProfit(nums))
}
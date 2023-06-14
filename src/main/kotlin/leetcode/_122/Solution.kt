package leetcode._122

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for(i in 1 until prices.size){
            val tmp = prices[i]-prices[i-1]
            if(tmp>0) maxProfit+=tmp
        }
        return maxProfit
    }
}

fun main() {
    val nums = intArrayOf(7, 6, 4, 3, 1)

    val solution = Solution()
    println(solution.maxProfit(nums))
}
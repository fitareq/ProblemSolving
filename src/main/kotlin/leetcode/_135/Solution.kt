package leetcode._135

class Solution {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size) { 1 }
        for (i in ratings.indices) {
            if (i > 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1])
                candies[i] = candies[i - 1] + 1
            if (i != ratings.size - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1])
                candies[i] = candies[i + 1] + 1
        }
        for (i in ratings.size - 1 downTo 0) {
            if (i != ratings.size - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1])
                candies[i] = candies[i + 1] + 1
        }

        return candies.sum()
    }
}

class Solution2 {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size) { 1 }
        for (i in 1 until ratings.size) {
            if (ratings[i] > ratings[i - 1]) candies[i] = candies[i - 1] + 1
        }
        for (i in ratings.size - 1 downTo 1) {
            if (ratings[i - 1] > ratings[i]) candies[i - 1] = candies[i - 1].coerceAtLeast(candies[i] + 1)
        }
        return candies.sum()
    }
}

fun main() {
//    val ratings = intArrayOf(1, 2, 2)
//    val ratings = intArrayOf(1, 0, 2)
    val ratings = intArrayOf(1, 2, 87, 87, 87, 2, 1)

    val solution = Solution()
    println(solution.candy(ratings))
}
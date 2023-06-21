package leetcode._238


class Solution {

    companion object {
        fun productExceptSelf(nums: IntArray): IntArray {
            val n = nums.size
            val result = IntArray(n)
            result[0] = 1
            for (i in 1 until n) {
                result[i] = result[i - 1] * nums[i - 1]
            }
            val left = IntArray(n)
            left[n - 1] = 1
            for (i in n - 2 downTo 0) {
                left[i] = left[i + 1] * nums[i + 1]
                result[i] *= left[i]
            }

            return result
        }

    }
}

fun main() {

    val nums = intArrayOf(1, 3, 2, 4)
    Solution.productExceptSelf(nums).forEach { println(it) }

}



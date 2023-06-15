package leetcode._55

class Solution {

    companion object{
        fun canJump(nums: IntArray): Boolean {
            val n = nums.size
            var maxReachable = 0
            for (i in 0 until n - 1) {
                maxReachable = maxReachable.coerceAtLeast(nums[i] + i)
                if (nums[i] ==0 && maxReachable == nums[i] + i) break

            }

            return maxReachable >= n - 1
        }
    }

}

fun main() {

    val nums = intArrayOf(0,1,2,2,1,2,2,2)
    println(Solution.canJump(nums))

}
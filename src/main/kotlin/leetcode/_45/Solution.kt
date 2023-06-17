package leetcode._45


class Solution {

    companion object {
        fun jump(nums: IntArray): Int {
            if (nums.size == 1) return 0
            var jump = 1
            var curMax = nums[0]
            var nextMax = nums[0]

            for (i in 1 until nums.size - 1) {
                nextMax = nextMax.coerceAtLeast(nums[i] + i)
                if (i == curMax){
                    ++jump
                    curMax = nextMax
                }
            }
            return jump
        }

    }
}

fun main() {

//    val nums = intArrayOf(2,3,0,1,4)
//    val nums = intArrayOf(2,3,1,1,4)
//    val nums = intArrayOf(2,2,2,2,2)
//    val nums = intArrayOf(1,2)
//    val nums = intArrayOf(0)
    val nums = intArrayOf(1,1,1,1)
//    val nums = intArrayOf(2, 1, 1, 1, 1)
    println(Solution.jump(nums))

}
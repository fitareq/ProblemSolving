package leetcode._169_

class Solution2 {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()

        return nums[nums.size/2]
    }
}
class Solution {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        val mid = (nums.size / 2.0).toInt()
        var count = 1
        var i = nums[0]
        for (j in 1 until nums.size) {
            if (nums[j] == i) {
                ++count
            } else {
                if (count > mid) return i
                else {
                    i = nums[j]
                    count = 1
                }

            }
        }
        return i
    }
}

fun main() {
    val nums1 = intArrayOf(-1,1,1,1,2,1)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3

    val solution = Solution()
    println(solution.majorityElement(nums1))
}
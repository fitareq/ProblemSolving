package leetcode._189

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        for(i in 0 until k){
            var first = nums[0]
            for(j in 1 until nums.size){
                val tmp = nums[j]
                nums[j] = first
                first = tmp
            }
            nums[0] = first
        }

        for (i in nums) print("$i ")
        println()
    }
}
class Solution2 {
    fun rotate(nums: IntArray, k: Int): Unit {
        nums.reverse()
        nums.reverse(0, k)
        nums.reverse(k,nums.size)
    }
}

fun main(){
    val nums = intArrayOf(1,2,3,4,5,6,7)

    val solution = Solution()
    //solution.rotate(nums, 3)

    val solution2 = Solution2()
    solution2.rotate(nums, 3)
}
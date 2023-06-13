package leetcode._80

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        for (k in 2 until nums.size){
            if ((nums[k]!= nums[i] || nums[k]!= nums[i-1])){
                nums[++i] = nums[k]
            }
        }
        return i+1
    }
}

fun main(){
    val nums1 = intArrayOf(1,1,1,1,1,1,2,3,3,3,4,5,6)

    val solution = Solution()

    println(solution.removeDuplicates(nums1))
}
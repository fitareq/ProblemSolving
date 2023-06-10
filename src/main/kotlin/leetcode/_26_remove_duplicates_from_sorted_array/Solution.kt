package leetcode._26_remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for(j in 1 until nums.size){
            if (nums[j]!=nums[i]){
                nums[++i] = nums[j]
            }
        }
        return i+1
    }
}

fun main() {

}
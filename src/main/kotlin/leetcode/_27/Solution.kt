package leetcode._27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        for (j in nums.indices)
        {
            if (nums[j] != `val`){
                nums[i] = nums[j]
                i++
            }
        }
        return i
    }
}
fun main(){

}
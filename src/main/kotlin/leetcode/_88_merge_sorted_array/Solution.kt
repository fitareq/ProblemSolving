package leetcode._88_merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0 until n){
            nums1[m+i] = nums2[i]
        }
        nums1.sort()
    }
}

fun main(){
    val nums1 = intArrayOf(1,2,3,0,0,0)
    val nums2 = intArrayOf(2,5,6)
    val m = 3
    val n = 3

    val solution = Solution()
    solution.merge(nums1, m, nums2, n)
}
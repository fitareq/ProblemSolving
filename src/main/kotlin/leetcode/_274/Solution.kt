package leetcode._274


class Solution {

    companion object {
        fun hIndex(citations: IntArray): Int {
            citations.sortDescending()
            var hIndex = 0
            for (i in citations.indices) {
                if (citations[i] >= i+1) ++hIndex
                else break
            }
            return hIndex
        }

    }
}

fun main() {

//    val nums = intArrayOf(2,3,0,1,4)
//    val nums = intArrayOf(2,3,1,1,4)
//    val nums = intArrayOf(2,2,2,2,2)
//    val nums = intArrayOf(1,2)
//    val nums = intArrayOf(0)
    val nums = intArrayOf(1,3,1,1)
//    val nums = intArrayOf(2, 1, 1, 1, 1)
    println(Solution.hIndex(nums))

}
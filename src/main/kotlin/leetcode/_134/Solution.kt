package leetcode._134

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var diff = 0
        var tmpDiff = 0
        var startingStation = 0
        for (i in gas.indices) {
            val tmp = gas[i] - cost[i]
            diff += tmp
            tmpDiff += tmp
            if (tmpDiff < 0) {
                tmpDiff = 0
                startingStation = i + 1
            }

        }

        return if (diff >= 0) startingStation else -1
    }
}

fun main() {
//    val gas = intArrayOf(1,2,3,4,5)
//    val cost = intArrayOf(3,4,5,1,2)

    val gas = intArrayOf(2, 3, 4)
    val cost = intArrayOf(3, 4, 3)

//    val gas = intArrayOf(5,1,2,3,4)
//    val cost = intArrayOf(4,4,1,5,1)

    val solution = Solution()
    println(solution.canCompleteCircuit(gas, cost))
}
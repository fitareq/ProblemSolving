# Gas Station

## Problem Description

There are `n` gas stations along a circular route, where the amount of gas at the `i-th` station is `gas[i]`.

You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from the `i-th` station to its next `(i+1)-th` station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays `gas` and `cost`, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return `-1`. If there exists a solution, it is guaranteed to be unique.

**Note:**

- Both `gas` and `cost` contain exactly `n` elements.
- If there exists a solution, it is guaranteed to be unique.

**Example 1:**

```
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
Therefore, return 3 as the starting index.
```


**Example 2:**

```
Input: gas = [2,3,4], cost = [3,4,3]
Output: -1
Explanation:
You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 0. Your tank = 4 - 3 + 2 = 3
Travel to station 1. Your tank = 3 - 3 + 3 = 3
You can't travel back to station 2, as it requires 4 unit of gas but you only have 3.
Therefore, you can't travel around the circuit once no matter where you start.
```


**Constraints:**

- `gas.length == n`
- `cost.length == n`
- `1 <= n <= 10^4`
- `0 <= gas[i], cost[i] <= 10^4`

## Approach

To solve this problem, we can use a greedy algorithm.

Here are the steps for the approach:

1. Initialize the variables `start` to 0 (starting gas station index), `totalGas` to 0 (total gas available), and `currentGas` to 0 (gas in the current tank).
2. Iterate through the gas stations from left to right.
    - Add the difference between the gas and cost at each station to `currentGas`.
    - If `currentGas` becomes negative, update `start` to the next gas station index and reset `currentGas` to 0.
    - Increment `totalGas` by the difference between the gas and cost.
3. If `totalGas` is negative, return -1 (no solution).
4. Otherwise, return `start` as the starting gas station index.

The time complexity of this approach is O(n), where n is the number of gas stations.

## Related Problems

- [Jump Game](https://leetcode.com/problems/jump-game/)
- [Jump Game II](https://leetcode.com/problems/jump-game-ii/)
- [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)


# Jump Game

## Problem Description

Given an array of non-negative integers `nums`, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

**Example 1:**
```
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
```
**Example 2:**
```
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3, but the last index is unreachable.
```
**Constraints:**

- `1 <= nums.length <= 3 * 10^4`
- `0 <= nums[i] <= 10^5`

## Approach

The problem can be solved by utilizing the concept of greedy algorithms.

Here are the steps for the approach:

1. Initialize a variable `maxPosition` to 0, which represents the maximum reachable index.
2. Iterate through the array `nums`:
   - If the current index `i` is greater than `maxPosition`, it means we cannot reach the current index. Return `false`.
   - Otherwise, update `maxPosition` to be the maximum value between `maxPosition` and `i + nums[i]`.
   - If `maxPosition` is greater than or equal to the last index of the array, return `true`.
3. If the loop finishes, it means we have successfully reached the last index.
4. Return `true`.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Jump Game II](https://leetcode.com/problems/jump-game-ii/)
- [Jump Game III](https://leetcode.com/problems/jump-game-iii/)
- [Jump Game IV](https://leetcode.com/problems/jump-game-iv/)
- [Jump Game V](https://leetcode.com/problems/jump-game-v/)


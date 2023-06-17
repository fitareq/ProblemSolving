
# Jump Game II

## Problem Description

Given an array of non-negative integers `nums`, you are initially positioned at the first index of the array.

Each element in the array represents the maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

**Example 1:**
```
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
```
**Example 2:**
```
Input: nums = [2,3,0,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 2 steps to the last index.
```
**Constraints:**

- `1 <= nums.length <= 10^4`
- `0 <= nums[i] <= 10^5`

## Approach

The problem can be solved using a greedy algorithm approach, known as the "Jump Game II" algorithm.

Here are the steps for the approach:

1. Initialize three variables: `currentJumpEnd`, `farthestJump`, and `jumps`.
   - Set `currentJumpEnd` to 0, which represents the current farthest point that can be reached.
   - Set `farthestJump` to 0, which represents the farthest point that can be reached after taking `jumps + 1` steps.
   - Set `jumps` to 0, which represents the minimum number of jumps required to reach the end.
2. Iterate through the array `nums` up to the second-to-last element:
   - Update `farthestJump` to be the maximum value between `farthestJump` and `i + nums[i]`.
   - If the current index `i` is equal to `currentJumpEnd`, it means we have reached the end of the current jump range. Update `currentJumpEnd` to be `farthestJump` and increment `jumps` by 1.
3. Return `jumps` as the minimum number of jumps required to reach the end.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Jump Game](https://leetcode.com/problems/jump-game/)
- [Jump Game III](https://leetcode.com/problems/jump-game-iii/)
- [Jump Game IV](https://leetcode.com/problems/jump-game-iv/)
- [Jump Game V](https://leetcode.com/problems/jump-game-v/)



# Majority Element

## Problem Description

Given an array `nums` of size n, find the majority element. The majority element is the element that appears more than `⌊n/2⌋` times.

You may assume that the majority element always exists in the array.

**Example 1:**
```
Input: nums = [3,2,3]
Output: 3
```
**Example 2:**
```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```
**Constraints:**

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

## Approach

The problem can be solved using the Boyer-Moore Voting Algorithm, which allows us to find the majority element in linear time and constant space.

Here are the steps for the approach:

1. Initialize two variables `candidate` and `count`:
   - Set `candidate` to the first element of the array `nums`.
   - Set `count` to 1.
2. Iterate through the array starting from the second element:
   - If the current element is equal to `candidate`, increment `count` by 1.
   - If the current element is different from `candidate`, decrement `count` by 1.
     - If `count` becomes 0, update `candidate` to the current element and set `count` to 1.
3. After the iteration, the `candidate` will hold the majority element.
4. Return `candidate` as the majority element.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Majority Element II](https://leetcode.com/problems/majority-element-ii/)
- [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
- [Single Number](https://leetcode.com/problems/single-number/)
- [Missing Number](https://leetcode.com/problems/missing-number/)



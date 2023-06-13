# Remove Duplicates from Sorted Array

## Problem Description

Given a sorted array `nums`, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

**Clarification:**

Confused why the returned value is an integer, but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.

**Example 1:**
```
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation:
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It does not matter what you leave beyond the returned length.
```
**Example 2:**
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
Explanation:
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It does not matter what values are set beyond the returned length.
```
**Constraints:**

- `0 <= nums.length <= 3 * 104`
- `-104 <= nums[i] <= 104`
- `nums is sorted in ascending order.`

## Approach

The problem can be solved using a two-pointer approach. We maintain two pointers, `i` and `j`, where `i` represents the current position, and `j` represents the position to be filled with the next non-duplicate element.

Here are the steps for the approach:

1. If the array is empty, return 0 as the length.
2. Initialize `i` to 0 and `j` to 1.
3. Iterate through the array starting from the second element:
    - If the current element is different from the previous element, increment `j` and set `nums[j]` to the current element.
    - If the current element is the same as the previous element, move to the next element without incrementing `j`.
4. Return `j` as the length of the array without duplicates.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Remove Element](https://leetcode.com/problems/remove-element/)
- [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
- [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)


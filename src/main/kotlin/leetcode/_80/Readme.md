
# Remove Duplicates from Sorted Array II

## Problem Description

Given a sorted array `nums`, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

**Clarification:**

Confused why the returned value is an integer, but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.

**Example 1:**
```
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
Explanation: Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2, and 3 respectively. It doesn't matter what you leave beyond the returned length.
```
**Example 2:**
```
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3]
Explanation: Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3, and 3 respectively. It doesn't matter what values are set beyond the returned length.
```
**Constraints:**

- `1 <= nums.length <= 3 * 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums is sorted in ascending order.`

## Approach

The problem can be solved by iterating through the array and maintaining a pointer to the current position where the next non-duplicate element should be placed.

Here are the steps for the approach:

1. Initialize a variable `count` to 1 to keep track of the number of occurrences of the current element.
2. Initialize a variable `j` to 1, which will be the pointer to the current position where the next non-duplicate element should be placed.
3. Iterate through the array starting from the second element:
   - If the current element is equal to the previous element, increment `count`.
   - If the current element is different from the previous element, reset `count` to 1.
   - If `count` is less than or equal to 2, update `nums[j]` with the current element and increment `j`.
4. Return `j` as the new length of the modified array.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
- [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
- [Remove Element](https://leetcode.com/problems/remove-element/)


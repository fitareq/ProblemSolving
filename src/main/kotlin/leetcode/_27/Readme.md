
# Remove Element

## Problem Description

Given an array `nums` and a value `val`, remove all instances of that value **in-place** and return the new length.

Do not allocate extra space for another array; you must do this by modifying the input array **in-place** with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

**Example 1:**
```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation:
Your function should return length = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned length.
```
**Example 2:**
```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,3,0,4]
Explanation:
Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4 respectively. It does not matter what values are set beyond the returned length.
```
**Constraints:**

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

## Approach

The problem can be solved using a two-pointer approach. We maintain two pointers, `i` and `j`, where `i` represents the current position, and `j` represents the position to be filled with the next non-value element.

Here are the steps for the approach:

1. Initialize `i` to 0 and `j` to 0.
2. Iterate through the array:
   - If the current element is not equal to `val`, assign `nums[i]` with the value of `nums[j]` and increment both `i` and `j`.
   - If the current element is equal to `val`, increment `j` to skip over the value to be removed.
3. Return `i` as the length of the modified array.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)



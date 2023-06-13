
# Merge Sorted Array

## Problem Description

You are given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

The number of elements initialized in `nums1` and `nums2` are `m` and `n` respectively. You may assume that `nums1` has enough space (size that is equal to `m + n`) to hold additional elements from `nums2`.

**Example 1:**
```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```
**Example 2:**
```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```
**Constraints:**

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-109 <= nums1[i], nums2[i] <= 109`

## Approach

The problem can be solved by using the Merge Sort algorithm. Since `nums1` has enough space to hold all the elements, we can start merging the arrays from the end.

Here are the steps for the approach:

1. Initialize three pointers, `p1`, `p2`, and `p`:
   - `p1` points to the last element of `nums1` that contains a valid number (m-1).
   - `p2` points to the last element of `nums2` (n-1).
   - `p` points to the last position of the merged array (m+n-1).
2. While `p1` and `p2` are greater than or equal to 0:
   - If `nums1[p1]` is greater than `nums2[p2]`, set `nums1[p]` to `nums1[p1]`, decrement `p1`, and decrement `p`.
   - Otherwise, set `nums1[p]` to `nums2[p2]`, decrement `p2`, and decrement `p`.
3. If there are any remaining elements in `nums2`, copy them to `nums1` starting from index 0 up to `p2+1`.
4. Return the merged and sorted `nums1` array.

The time complexity of this approach is O(m + n), where m and n are the lengths of `nums1` and `nums2`, respectively.

## Related Problems

- [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
- [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)
- [Sort Colors](https://leetcode.com/problems/sort-colors/)
- [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)



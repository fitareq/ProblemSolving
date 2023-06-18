
# H-Index

## Problem Description

Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has an index h if h of their n papers have at least h citations each, and the other n - h papers have no more than h citations each."

**Example:**
```
Input: citations = [3,0,6,1,5]
Output: 3
Explanation: The researcher has 5 papers with citations [3,0,6,1,5]. The researcher's h-index is 3 because they have 3 papers with at least 3 citations.
```
**Note:**

If there are several possible values for h, the maximum one is taken as the h-index.

**Follow up:**

- This is a follow-up problem to [H-Index](https://leetcode.com/problems/h-index/) where citations is now guaranteed to be sorted in ascending order.
- Could you solve it in logarithmic time complexity?

## Approach

The problem can be solved by using a binary search algorithm.

Here are the steps for the approach:

1. Initialize two variables, `left` and `right`, to 0 and the length of the citations array `citations` minus 1, respectively.
2. While `left` is less than or equal to `right`:
   - Calculate the middle index as `mid = (left + right) / 2`.
   - If the citation count at index `mid` is greater than or equal to `n - mid`, it means there are at least `n - mid` papers with citations greater than or equal to `n - mid`. Move the `right` pointer to `mid - 1`.
   - Otherwise, move the `left` pointer to `mid + 1`.
3. After the binary search, the `right` pointer will be pointing to the h-index.
4. Return `n - right` as the h-index.

The time complexity of this approach is O(log n), where n is the length of the input array.

## Related Problems

- [H-Index II](https://leetcode.com/problems/h-index-ii/)
- [Citations](https://leetcode.com/problems/citations/)



# Product of Array Except Self

## Problem Description

Given an integer array `nums`, return an array `output` such that `output[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

**Example:**
```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

Example 2:
```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```
**Constraints:**

- 2 <= nums.length <= 10^5
- -30 <= nums[i] <= 30
- The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

**Note:**

Please solve it without division and in O(n) time complexity.

**Follow up:**

Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

## Approach

The problem can be solved by using two passes of the array to calculate the product of all elements except the current element.

Here are the steps for the approach:

1. Initialize an array `output` of the same length as `nums` to store the products.
2. Iterate over the `nums` array from left to right and calculate the running product of all elements except the current element.
   - Initialize a variable `product` to 1.
   - For each element `nums[i]`, update `output[i]` with the current value of `product`.
   - Multiply `product` by `nums[i]` to include the current element in the running product.
3. Iterate over the `nums` array from right to left and update the `output` array with the running product from the right side.
   - Initialize a variable `product` to 1.
   - For each element `nums[i]`, multiply `output[i]` by `product` to include the running product from the right side.
   - Multiply `product` by `nums[i]` to include the current element in the running product from the right side.
4. Return the `output` array.

The time complexity of this approach is O(n), where n is the length of the `nums` array. The space complexity is O(1) since the `output` array is not considered as extra space.

## Related Problems

- [Product of Two Numbers](https://leetcode.com/problems/product-of-two-numbers/)
- [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
- [Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/)



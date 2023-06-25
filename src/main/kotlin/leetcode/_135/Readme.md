
# Candy

## Problem Description

There are `n` children standing in a line. Each child is assigned a rating value given in the integer array `ratings`.

You are giving candies to these children, subject to the following requirements:

- Each child must have at least one candy.
- Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies to the children.

**Example 1:**
```
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second, and third child with 2, 1, 2 candies respectively.
```
**Example 2:**
```
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second, and third child with 1, 2, 1 candies respectively. The third child gets 1 candy because it satisfies the above two conditions.
```
**Constraints:**

- `n == ratings.length`
- `1 <= n <= 2 * 10^4`
- `0 <= ratings[i] <= 2 * 10^4`

## Approach

The problem can be solved by using two passes of the ratings array.

Here are the steps for the approach:

1. Initialize a candies array of length `n` with all elements set to 1. This represents the minimum number of candies each child must have.
2. Iterate over the ratings array from left to right and update the candies array based on the ratings and neighbors.
   - For each element `ratings[i]`, compare it with its left neighbor `ratings[i-1]`.
   - If `ratings[i]` is greater than `ratings[i-1]`, set `candies[i] = candies[i-1] + 1` to ensure the child with a higher rating gets more candies than the left neighbor.
3. Iterate over the ratings array from right to left and update the candies array again based on the ratings and neighbors.
   - For each element `ratings[i]`, compare it with its right neighbor `ratings[i+1]`.
   - If `ratings[i]` is greater than `ratings[i+1]` and `candies[i] <= candies[i+1]`, set `candies[i] = candies[i+1] + 1` to ensure the child with a higher rating gets more candies than the right neighbor.
4. Sum up all the elements in the candies array to get the minimum number of candies needed to distribute.

The time complexity of this approach is O(n), where n is the length of the ratings array. The space complexity is O(n) as well since we need to create the candies array.

## Related Problems

- [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
- [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)
- [Non-decreasing Array](https://leetcode.com/problems/non-decreasing-array/)


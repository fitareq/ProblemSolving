
# Best Time to Buy and Sell Stock II

## Problem Description

You are given an array `prices` where `prices[i]` is the price of a given stock on the i-th day.

Find the maximum profit you can achieve by buying and selling the stock multiple times. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

**Note:** You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

**Example 1:**
```
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit = 4 + 3 = 7.
```
**Example 2:**
```
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit = 4.
```
**Example 3:**
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```
**Constraints:**

- `1 <= prices.length <= 3 * 10^4`
- `0 <= prices[i] <= 10^4`

## Approach

The problem can be solved by iterating through the given array and accumulating the profits from consecutive increasing stock prices.

Here are the steps for the approach:

1. Initialize a variable `maxProfit` to 0 to keep track of the maximum profit.
2. Iterate through the `prices` array starting from the second element:
   - If the current price is greater than the previous price, add the difference to `maxProfit`.
3. Return `maxProfit` as the maximum profit achievable.

The time complexity of this approach is O(n), where n is the length of the input array.

## Related Problems

- [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- [Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)
- [Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)
- [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)


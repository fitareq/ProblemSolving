# Best Time to Buy and Sell Stock

## Problem Description

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.

**Example 1:**
```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation:
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```
**Example 2:**
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation:
In this case, no transactions are done and the max profit = 0.
```
**Constraints:**

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

## Approach

The problem can be solved using a simple one-pass approach. We iterate through the array of prices and keep track of the minimum price seen so far (`minPrice`). We update the maximum profit (`maxProfit`) by calculating the difference between the current price and the minimum price.

Here are the steps for the approach:

1. Initialize `minPrice` to be equal to the first price in the array.
2. Initialize `maxProfit` to 0.
3. Iterate through the prices starting from the second element:
    - Update `minPrice` to the minimum of the current price and `minPrice`.
    - Update `maxProfit` to the maximum of the difference between the current price and `minPrice`, and `maxProfit`.
4. Return `maxProfit` as the maximum achievable profit.

The time complexity of this approach is O(n), where n is the length of the prices array.

## Related Problems

- [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
- [Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)
- [Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)
- [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)


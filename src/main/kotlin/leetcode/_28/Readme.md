
# Find the Index of the First Occurrence in a String

## Problem Description

Given a string `haystack` and a string `needle`, find the index of the first occurrence of `needle` in `haystack`. If `needle` is not part of `haystack`, return -1.

**Example:**
```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Constraints:**

- `0 <= haystack.length, needle.length <= 5 * 10^4`
- `haystack` and `needle` consist of only lower-case English characters.

## Approach

The problem can be solved by using the built-in `indexOf` function or by implementing a simple algorithm.

### Approach 1: Using indexOf Function

Here are the steps for the approach using the built-in `indexOf` function:

1. Call the `indexOf` function on the `haystack` string, passing the `needle` string as the argument.
2. Return the result of the `indexOf` function, which will be the index of the first occurrence of the `needle` string in the `haystack` string.
3. If the `indexOf` function returns -1, it means the `needle` string is not part of the `haystack` string.

The time complexity of this approach is O(n), where n is the length of the `haystack` string.

### Approach 2: Simple Algorithm

Alternatively, you can implement a simple algorithm to find the index of the first occurrence of the `needle` string in the `haystack` string.

Here are the steps for the algorithm:

1. Initialize a variable `index` to -1, which will store the index of the first occurrence of the `needle` string.
2. Iterate over the `haystack` string using a loop with an index variable `i` ranging from 0 to `haystack.length - needle.length`.
   - Extract a substring from the `haystack` string starting from index `i` with a length equal to the length of the `needle` string.
   - If the extracted substring is equal to the `needle` string, update the `index` variable with the current value of `i` and break out of the loop.
3. Return the value of the `index` variable, which will be the index of the first occurrence of the `needle` string in the `haystack` string.
4. If the `index` variable is still -1 after the loop, it means the `needle` string is not part of the `haystack` string.

The time complexity of this algorithm is O(n*m), where n is the length of the `haystack` string and m is the length of the `needle` string.

## Related Problems

- [Implement strStr()](https://leetcode.com/problems/implement-strstr/)
- [Shortest Palindrome](https://leetcode.com/problems/shortest-palindrome/)
- [Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)


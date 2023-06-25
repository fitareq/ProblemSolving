# Reverse Words in a String

## Problem Description

Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

**Note:**

- You may assume that the input string does not contain leading or trailing spaces and the words are always separated by a single space.

- You may assume that there will be no extra spaces in the input string.

**Example 1:**
```
Input: s = "the sky is blue"
Output: "blue is sky the"
```
**Example 2:**
```
Input: s = " hello world "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```
**Example 3:**
```
Input: s = "a good example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
```
**Example 4:**

```
Input: s = " Bob Loves Alice "
Output: "Alice Loves Bob"
```

**Example 5:**

```
Input: s = "Alice does not even like bob"
Output: "bob like even not does Alice"
```

**Constraints:**

- `1 <= s.length <= 10^4`
- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '` only.
- There is at least one word in `s`.

## Approach

The problem can be solved by splitting the input string into words, reversing the order of the words, and joining them back together.

Here are the steps for the approach:

1. Split the input string `s` into words using space `' '` as the delimiter.
2. Reverse the order of the words.
3. Join the reversed words using a space `' '` as the separator.
4. Return the joined string.

The time complexity of this approach is O(n), where n is the length of the input string `s`.

## Related Problems

- [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
- [Reverse String](https://leetcode.com/problems/reverse-string/)
- [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

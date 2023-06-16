# Length of Last Word

## Problem Description

Given a string `s` consisting of only printable ASCII characters, return the length of the last word in the string.

A word is defined as a maximal substring consisting of non-space characters only.

**Example 1:**
```
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with a length of 5.
```
**Example 2:**
```
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with a length of 4.
```
**Example 3:**
```
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with a length of 6.
```
**Constraints:**

- `1 <= s.length <= 10^4`
- `s consists of only printable ASCII characters and spaces ' '.`

## Approach

The problem can be solved by iterating through the string in reverse order and counting the length of the last word.

Here are the steps for the approach:

1. Initialize a variable `length` to 0 to keep track of the length of the last word.
2. Iterate through the string `s` in reverse order:
   - If the current character is a space ' ', continue to the next character.
   - If the current character is not a space, increment `length` by 1.
      - If `length` is not 0 and the previous character (i.e., the next character in reverse order) is a space, we have reached the end of the last word. Return `length`.
3. If the loop finishes without encountering a non-space character, it means there are no words in the string. Return `0`.

The time complexity of this approach is O(n), where n is the length of the input string.

## Related Problems

- [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
- [Reverse Words in a String II](https://leetcode.com/problems/reverse-words-in-a-string-ii/)
- [Reverse String](https://leetcode.com/problems/reverse-string/)
- [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)


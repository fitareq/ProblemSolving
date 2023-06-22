package leetcode._151

class Solution {
    fun reverseWords(s: String): String {
        var str = ""
        s.replace("\\s+".toRegex(), " ").split(" ").forEach {
            str = "$it $str"
        }
        return str.trim()
    }
}

fun main() {
    val s = "the sky is blue"

    val solution = Solution()
    solution.reverseWords(s)
}
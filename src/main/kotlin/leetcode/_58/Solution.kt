package leetcode._58


class Solution {

    companion object {
        fun lengthOfLastWord(s: String): Int {
            return s.trim().let {
                it.substring(it.lastIndexOf(" ") + 1, it.length).length
            }
        }

    }
}

fun main() {

    val s = "   fly me   to   the moon  "
    println(Solution.lengthOfLastWord(s))

}
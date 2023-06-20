package leetcode._28

/*
C++
class Solution {
    public:
    int strStr(string haystack, string needle) {
        if(needle.empty()) return 0;
        return haystack.find(needle);
    }
};
*/
class Solution {

    companion object {
        fun strStr(haystack: String, needle: String): Int {
            if (haystack.contains(needle)) {
                return haystack.indexOf(needle)
            }
            return -1
        }

    }
}

fun main() {

    val haystack = "leetcode"
    val needle = "leeto"
    println(Solution.strStr(haystack, needle))

}



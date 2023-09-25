package leetcode.String;

public class IsSubsequence {
    /**
     * Leetcode 392
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
     * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a
     * subsequence of "abcde" while "aec" is not).
     */
    static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        int counter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(counter)) {
                counter++;
            }
            if (counter == s.length()) {
                return true;
            }
        }
        return false;
    }
}

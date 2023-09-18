package leetcode.String;

public class LongestPalindromicSubstring {
    /**
     * Leetcode 5
     * Given a string s, return the longest palindromic substring in s.
     */
    static int maxLength = 0;
    static int lo = 0;
    public static String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < str.length; i++) {
            expand(str, i, i);
            expand(str, i, i + 1);
        }
        return s.substring(lo, lo + maxLength);
    }

    private static void expand(char[] str, int j, int k) {
        while (j >= 0 && k < str.length && str[j] == str[k]) {
            j--;
            k++;
        }
        if (maxLength < k - j - 1) {
            maxLength = k - j - 1;
            lo = j + 1;
        }
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}

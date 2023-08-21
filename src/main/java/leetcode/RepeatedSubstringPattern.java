package leetcode;

public class RepeatedSubstringPattern {
    /**
     * Leetcode 459
     * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of
     * the substring together.
     */
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        System.out.println("Doubled: " + doubled + ". Substring: " + sub);
        return sub.contains(s);
    }
}

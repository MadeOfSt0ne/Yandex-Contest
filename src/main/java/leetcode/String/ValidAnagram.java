package leetcode.String;

import java.util.Arrays;

public class ValidAnagram {
    /**
     * Leetcode
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
     * all the original letters exactly once.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] one = new int[26];
        int[] two = new int[26];
        for (int i = 0; i < s.length(); i++) {
            one[s.charAt(i) - 'a']++;
            two[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(one, two);
    }
}

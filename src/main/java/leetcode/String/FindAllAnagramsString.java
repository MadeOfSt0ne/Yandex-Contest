package leetcode.String;

import java.util.*;

public class FindAllAnagramsString {
    /**
     * Leetcode 438
     * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the
     * answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
     * all the original letters exactly once.
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }
        int[] sArray = new int[26];
        int[] pArray = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            pArray[p.charAt(i) - 'a']++;
        }

        if (isAnagram(sArray, pArray)) {
            ans.add(0);
        }
        for (int j = p.length(); j < s.length(); j++) {
            sArray[s.charAt(j) - 'a']++;
            sArray[s.charAt(j - p.length()) - 'a']--;
            if (isAnagram(sArray, pArray)) {
                ans.add(j - p.length() + 1);
            }
        }
        return ans;
    }

    private static boolean isAnagram(int[] sArray, int[] pArray) {
        return Arrays.equals(sArray, pArray);
    }
}

package leetcode;

public class PermutationInString {
    /**
     * Leetcode 567
     * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or else false otherwise.
     * In other words, return true if one of s1's permutations is the substring of s2.
     */
    static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] sub = new int[26];
        int[] string = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            sub[s1.charAt(i) - 'a']++;
            string[s2.charAt(i) - 'a']++;
        }
        if (matches(sub, string)) {
            return true;
        }
        for (int j = s1.length(); j < s2.length(); j++) {
            string[s2.charAt(j) - 'a']++;
            string[s2.charAt(j - s1.length()) - 'a']--;
            if (matches(sub, string)) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(int[] sub, int[] string) {
        for (int i = 0; i < 26; i++) {
            if (sub[i] != string[i]) {
                return false;
            }
        }
        return true;
    }
}

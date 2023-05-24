package leetcode;

import java.util.Arrays;

public class ImplementStrStr {
    /**
     * Leetcode 28
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if
     * needle is not part of haystack.
     */
    static int strStr(String haystack, String needle) {
        if  (needle.length() > haystack.length()) {
            return -1;
        }
        int left = 0;
        int right = needle.length();
        while (right <= haystack.length()) {
            System.out.println("sub = " + haystack.substring(left, right));
            if (haystack.substring(left, right).equals(needle)) {
                return left;
            } else {
                left++;
                right++;
            }
        }
        return -1;
    }
}

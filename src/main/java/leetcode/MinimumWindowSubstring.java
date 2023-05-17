package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    /**
     * Leetcode 76
     * Given two strings s and t of lengths m and n respectively, return the minimum window
     * substring of s such that every character in t (including duplicates) is included in the window. If there is no
     * such substring, return the empty string "".
     * The testcases will be generated such that the answer is unique.
     */
    public String minWindow(String s, String t) {
        if (t.length() > s.length() || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        int count;
        for (int i = 0; i < t.length(); i++) {
            count = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), count + 1);
        }
        int left = 0;
        int right = 0;
        int formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {-1, 0, 0};
        while (right < s.length()) {
            char c = s.charAt(right);
            count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);
            if (tMap.containsKey(c) && windowCounts.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }
            while (left <= right && formed == tMap.size()) {
                c = s.charAt(left);
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (tMap.containsKey(c) && windowCounts.get(c) < tMap.get(c)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}

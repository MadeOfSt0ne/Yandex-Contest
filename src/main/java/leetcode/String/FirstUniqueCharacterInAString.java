package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    /**
     * Leetcode 387
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
     * return -1.
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (ans.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

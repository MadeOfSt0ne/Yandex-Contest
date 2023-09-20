package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /**
     * Leetcode 383
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
     * from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     */
    static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char m : magazine.toCharArray()) {
            if (map.containsKey(m)) {
                int count = map.get(m);
                if (count == 1) {
                    map.remove(m);
                } else {
                    map.put(m, count - 1);
                }
            }
        }
        return map.keySet().isEmpty();
    }
}

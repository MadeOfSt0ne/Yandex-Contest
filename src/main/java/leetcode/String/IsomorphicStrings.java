package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    /**
     * Leetcode 205
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving the order of characters.
     * No two characters may map to the same character, but a character may map to itself.
     */
    static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (mapT.containsKey(t.charAt(i))) {
                if (mapT.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
            map.put(s.charAt(i), t.charAt(i));
            mapT.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }

    static boolean isomorphic(String s, String t) {
        int[] arrS = new int[200];
        int[] arrT = new int[200];
        for (int i = 0; i < s.length(); i++) {
            if (arrS[s.charAt(i)] != arrT[t.charAt(i)]) {
                return false;
            }
            arrS[s.charAt(i)] = i + 1;
            arrT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

package leetcode.String;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {
    /**
     * Leetcode 30
     * You are given a string s and an array of strings words. All the strings of words are of the same length.
     * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
     * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab"
     * are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation of
     * any permutation of words.
     * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
     */
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int m = words.length;
        if (s.isEmpty() || m == 0) {
            return new ArrayList<>();
        }
        int n = words[0].length();
        int sl = s.length();
        Map<String, Integer> map1 = new HashMap<>();
        for (String p : words){
            map1.put(p, map1.getOrDefault(p,0) + 1);
        }
        for (int i = 0; i <= sl - (m * n); i++){
            String whole = s.substring(i, i + m * n);
            if (valid(whole, map1, n)){
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean valid(String whole, Map<String, Integer> map1, int n){
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < whole.length(); i += n){
            String s = whole.substring(i, i + n);
            map2.put(s, map2.getOrDefault(s,0) + 1);
        }
        return map2.equals(map1);
    }
}

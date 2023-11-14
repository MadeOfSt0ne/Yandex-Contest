package leetcode.String;

import java.util.*;

public class SortVowelsInString {
    /**
     * Leetcode 2785
     * Given a 0-indexed string s, permute s to get a new string t such that:
     * All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such
     * that s[i] is a consonant, then t[i] = s[i].
     * The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices
     * i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value
     * than t[j].
     * Return the resulting string.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise
     * all letters that are not vowels.
     */

    static String sortVowels(String s) {
        List<Character> vowels = List.of('A', 'a', 'e', 'E', 'I', 'i', 'o', 'O', 'U', 'u');
        Queue<Character> chars = new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                chars.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append(chars.poll());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

package leetcode.Dynamic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    /**
     * Leetcode 1048
     * You are given an array of words where each word consists of lowercase English letters.
     * wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without
     * changing the order of the other characters to make it equal to wordB.
     * For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
     * A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of
     * word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
     * Return the length of the longest possible word chain with words chosen from the given list of words.
     */
    static int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> dp = new HashMap<>();
        int maxChain = 0;
        for (String word : words) {
            dp.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                if (dp.containsKey(prev)) {
                    dp.put(word, Math.max(dp.get(word), dp.get(prev) + 1));
                }
            }
            maxChain = Math.max(maxChain, dp.get(word));
            System.out.println("word is " + word + " .chain is " + dp.get(word));
        }
        return maxChain;
    }
}

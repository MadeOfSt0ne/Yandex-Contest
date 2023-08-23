package leetcode.String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

    /**
     * Leetcode 767
     * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
     * Return any possible rearrangement of s or return "" if not possible.
     */
    public String reorganizeString(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());

        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char char1 = maxHeap.poll();
            char char2 = maxHeap.poll();

            sb.append(char1).append(char2);
            freqMap.put(char1, freqMap.get(char1) - 1);
            freqMap.put(char2, freqMap.get(char2) - 1);

            if (freqMap.get(char1) > 0) {
                maxHeap.add(char1);
            }
            if (freqMap.get(char2) > 0) {
                maxHeap.add(char2);
            }
        }

        if (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            if (freqMap.get(ch) > 1) {
                return "";
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}

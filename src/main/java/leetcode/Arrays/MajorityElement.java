package leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Leetcode 169
     * Given an array 'nums' of size 'n', return the majority element.
     * The majority element is the element that appears more than 'n / 2' times. You may assume that the majority
     * element always exists in the array.
     */
    int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    /**
     * Leetcode 560
     * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
     * A subarray is a contiguous non-empty sequence of elements within an array.
     */
    static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            currSum += num;
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}

package leetcode.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarraysDistinctElementSumOfSquares1 {
    /**
     * Leetcode 2913
     * You are given a 0-indexed integer array nums.
     * The distinct count of a subarray of nums is defined as:
     * Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length.
     * Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
     * Return the sum of the squares of distinct counts of all subarrays of nums.
     * A subarray is a contiguous non-empty sequence of elements within an array.
     */
    static int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                int a = i;
                while (a <= j) {
                    set.add(nums.get(a));
                    a++;
                }
                sum += set.size() * set.size();
                set.clear();
            }
        }
        return sum;
    }

    /**
     * 1 2 3 4 5
     * 12 23 34 45
     * 123 234 345
     * 1234 2345
     * 12345
     */
}

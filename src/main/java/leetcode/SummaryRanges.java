package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    /**
     * Leetcode 228
     * You are given a sorted unique integer array nums.
     * A range [a,b] is the set of all integers from a to b (inclusive).
     * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element
     * of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges
     * but not in nums.
     * Each range [a,b] in the list should be output as:
     * 1. "a->b" if a != b
     * 2. "a" if a == b
     */
    static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int left;
        for (int right = 0; right < nums.length; right++) {
            left = nums[right];
            while (right + 1 < nums.length && nums[right] + 1 == nums[right + 1]) {
                right++;
            }
            if (left != nums[right]) {
                ans.add(left + "->" + nums[right]);
            } else {
                ans.add(String.valueOf(left));
            }
        }
        return ans;
    }
}

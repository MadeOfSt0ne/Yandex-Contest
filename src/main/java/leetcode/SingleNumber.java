package leetcode;

public class SingleNumber {
    /**
     * Leetcode 136
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }
}

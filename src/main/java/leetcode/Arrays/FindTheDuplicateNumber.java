package leetcode.Arrays;

public class FindTheDuplicateNumber {
    /**
     * Leetcode 287
     * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     * There is only one repeated number in nums, return this repeated number.
     * You must solve the problem without modifying the array nums and uses only constant extra space.
     */
    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        System.out.println("Begin. slow = " + slow + ". fast = " + fast);
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println("slow = " + slow + ". fast = " + fast);
        } while (slow != fast);

        int slow2 = nums[0];

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
            System.out.println("slow = " + slow + ". slow2 = " + slow2);
        }

        return slow;
    }
}

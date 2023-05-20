package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SquaresOfSortedArray {
    /**
     * Leetcode 977
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
     * sorted in non-decreasing order.
     */
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        Deque<Integer> deque = new ArrayDeque<>();
        while (left <= right) {
            var leftValue = nums[left] * nums[left];
            var rightValue = nums[right] * nums[right];
            if (leftValue < rightValue) {
                deque.addFirst(rightValue);
                right--;
            } else {
                deque.addFirst(leftValue);
                left++;
            }
        }
        return deque.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    static int[] sortedSquares2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[nums.length];
        int index = nums.length - 1;
        int currMax;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                currMax = nums[right];
                right--;
            } else {
                currMax = nums[left];
                left++;
            }
            /*currMax = Math.abs(nums[left]) < Math.abs(nums[right]) ? nums[right] : nums[left];
            if (currMax == nums[right]) {
                right--;
            } else {
                left++;
            }*/
            ans[index] = currMax * currMax;
            index--;
        }
        return ans;
    }
}

package leetcode.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * Leetcode 88
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To
     * accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be
     * merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    static byte merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        int one = m - 1;
        int two = n - 1;
        while (two >= 0) {
            if (nums1[one] >= 0 && nums1[one] > nums2[two]) {
                nums1[idx--] = nums1[one--];
            } else {
                nums1[idx--] = nums2[two--];
            }
        }
        System.out.println("nums1 = " + Arrays.toString(nums1));
        return 0;
    }
}

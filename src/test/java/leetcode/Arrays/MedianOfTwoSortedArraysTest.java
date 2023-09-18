package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        assertEquals(2.00000, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.50000, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = {};
        int[] nums2 = {3, 4};
        assertEquals(3.50000, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}
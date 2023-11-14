package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @Test
    void search1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, SearchInRotatedSortedArray.search(nums, 0));
    }

    @Test
    void search2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, SearchInRotatedSortedArray.search(nums, 3));
    }

    @Test
    void search3() {
        int[] nums = {1};
        assertEquals(-1, SearchInRotatedSortedArray.search(nums, 0));
    }
}
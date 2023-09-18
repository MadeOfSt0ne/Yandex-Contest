package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(2, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(1, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert3() {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        assertEquals(2, SearchInsertPosition.searchInsert(nums, target));
    }
}
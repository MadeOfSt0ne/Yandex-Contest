package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    @Test
    void containsDuplicate1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(ContainsDuplicateII.containsDuplicate(nums, k));
    }

    @Test
    void containsDuplicate2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertTrue(ContainsDuplicateII.containsDuplicate(nums, k));
    }

    @Test
    void containsDuplicate3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(ContainsDuplicateII.containsDuplicate(nums, k));
    }
}
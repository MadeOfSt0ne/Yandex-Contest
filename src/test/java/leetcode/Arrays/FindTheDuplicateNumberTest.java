package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDuplicateNumberTest {

    @Test
    void findDuplicate1() {
        int[] nums = {3, 2, 1, 4, 2};
        assertEquals(2, FindTheDuplicateNumber.findDuplicate(nums));
    }
}
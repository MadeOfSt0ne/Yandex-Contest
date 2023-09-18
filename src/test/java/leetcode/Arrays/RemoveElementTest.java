package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, RemoveElement.removeElement(nums, val));
    }

    @Test
    void removeElement2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        assertEquals(5, RemoveElement.removeElement(nums, val));
    }
}
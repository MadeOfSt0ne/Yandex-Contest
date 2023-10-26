package InternDayAutumn23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LISTest {

    @Test
    void lis1() {
        int[] nb = {6, 6};
        int[] nums = {5, 3, 2, 4, 6, 1};
        assertEquals(3, LIS.lis(nb, nums));
    }

    @Test
    void lis2() {
        int[] nb = {6, 1};
        int[] nums = {1, 1, 2, 2, 3, 3};
        assertEquals(6, LIS.lis(nb, nums));
    }

    @Test
    void lis3() {
        int[] nb = {5, 5};
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, LIS.lis(nb, nums));
    }

    @Test
    void lis4() {
        int[] nb = {6, 1};
        int[] nums = {5, 3, 2, 4, 6, 1};
        assertEquals(2, LIS.lis(nb, nums));
    }

    @Test
    void lis5() {
        int[] nb = {6, 0};
        int[] nums = {1, 1, 2, 2, 3, 3};
        assertEquals(2, LIS.lis(nb, nums));
    }
}
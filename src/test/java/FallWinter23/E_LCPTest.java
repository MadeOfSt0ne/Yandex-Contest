package FallWinter23;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class E_LCPTest {

    @Test
    void countLCPSum1() {
        List<int[]> arrays = List.of(new int[]{1, 2, 4, 5}, new int[]{1, 3}, new int[]{1, 2, 3}, new int[]{});
        assertEquals(4, E_LCP.countLCPSum(arrays));
    }

    @Test
    void countLCPSum2() {
        List<int[]> arrays = List.of(new int[]{5}, new int[]{1, 2}, new int[]{5, 1, 2});
        assertEquals(1, E_LCP.countLCPSum(arrays));
    }
}
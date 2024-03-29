package FallWinter23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C_SQLRequestTest {

    @Test
    void countSum1() {
        int[][] matrix = {new int[]{1, 1, 1, 1}, new int[]{2, 2, 3, 3}};
        String[] str = {"a > 1", "b > 1", "b < 3", "c > 4", "d < 2"};
        String[] words = {"a", "b", "c", "d"};
        assertEquals(5, C_SQLRequest.countSum(matrix, str, words));
    }
}
package FallWinter23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldCTest {

    @Test
    void countSum1() {
        int[][] matrix = {new int[]{1, 1, 1, 1}, new int[]{2, 2, 3, 3}};
        String[] str = {"a > 1", "b > 1", "b < 3", "c > 1", "d < 2"};
        String[] words = {"a", "b", "c", "d"};
        assertEquals(0, OldC.countSum(matrix, str));
    }

    @Test
    void countSum2() {
        int[][] matrix = {new int[]{1, 1}, new int[]{2, 2}};
        String[] str = {"a < 3", "b > 1", "b < 3"};
        String[] words = {"a", "b"};
        assertEquals(4, OldC.countSum(matrix, str));
    }

    @Test
    void countSum3() {
        int[][] matrix = {new int[]{1, 1, 1, 1}, new int[]{2, 2, 2, 2}, new int[]{3, 3, 3, 3}};
        String[] str = {"a > 0", "b > 0", "b < 5", "c > 0", "d < 30"};
        String[] words = {"a", "b", "c", "d"};
        assertEquals(24, OldC.countSum(matrix, str));
    }
}
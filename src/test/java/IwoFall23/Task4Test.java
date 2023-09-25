package IwoFall23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void countSadness1() {
        int[][] dates = {{1, 2}, {2, 3}, {2, 1}, {6, 2}};
        int m = 3;
        assertEquals(5, Task4.countSadness(m));
    }

    @Test
    void countSadness2() {
        int[][] dates = {{1, 1}, {1, 2}, {3, 1}, {4, 2}};
        int m = 2;
        assertEquals(5, Task4.countSadness(m));
    }
}
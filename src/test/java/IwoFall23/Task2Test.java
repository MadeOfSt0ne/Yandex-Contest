package IwoFall23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void countMin1() {
        int extra = 0;
        int[] sizes = {15, 19};
        assertEquals(4, Task2.countMin(extra, sizes));
    }

    @Test
    void countMin2() {
        int extra = 2;
        int[] sizes = {1, 11, 6, 41, 15, 13, 14};
        assertEquals(9, Task2.countMin(extra, sizes));
    }

    @Test
    void countMin3() {
        int extra = 5;
        int[] sizes = {80, 80, 80, 80, 90, 80, 80};
        assertEquals(0, Task2.countMin(extra, sizes));
    }
}
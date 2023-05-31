package SpringSummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class taskCTest {

    @Test
    void getProfit1() {
        int n = 8;
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(0, taskC.getProfit(n, prices));
    }

    @Test
    void getProfit2() {
        int n = 5;
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(0, taskC.getProfit(n, prices));
    }

    @Test
    void getProfit3() {
        int n = 5;
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, taskC.getProfit(n, prices));
    }

    @Test
    void getProfit4() {
        int n = 6;
        int[] prices = {1, 4, 2, 3, 3, 5};
        assertEquals(0, taskC.getProfit(n, prices));
    }

    @Test
    void getProfit5() {
        int n = 5;
        int[] prices = {10, 5, 5, 7, 6};
        assertEquals(0, taskC.getProfit(n, prices));
    }

    @Test
    void getProfit6() {
        int n = 3;
        int[] prices = {3, 2, 2};
        assertEquals(0, taskC.getProfit(n, prices));
    }
}
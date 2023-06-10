package SpringSummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buySellStocksTest {

    @Test
    void getProfit1() {
        int n = 14;
        int[] prices = {10, 20, 10, 20, 10, 30, 10, 20, 15, 50, 10, 20, 10, 20};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 2 : 1 3, 5 8
    }

    @Test
    void getProfit2() {
        int n = 7;
        int[] prices = {1, 2, 3, 4, 5, 3, 5};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 2 : 1 5, 6 7
    }

    @Test
    void getProfit3() {
        int n = 5;
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 0
    }

    @Test
    void getProfit4() {
        int n = 6;
        int[] prices = {1, 4, 2, 3, 3, 5};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 2 : 1 2, 3 6
    }

    @Test
    void getProfit5() {
        int n = 5;
        int[] prices = {10, 5, 5, 7, 6};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 1 : 2 4
    }

    @Test
    void getProfit6() {
        int n = 3;
        int[] prices = {3, 2, 2};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 0
    }

    @Test
    void getProfit7() {
        int n = 8;
        int[] prices = {10, 20, 10, 20, 2, 5, 2, 5};
        assertEquals(0, BuySellStocks.getProfit(n, prices));
        // 2 : 2 5, 6 7
    }
}
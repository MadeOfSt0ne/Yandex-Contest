package leetcode;

import leetcode.Dynamic.BestTimeToBuyAndSellStock3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock3Test {

    @Test
    void maxProfit2() {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(6, BestTimeToBuyAndSellStock3.maxProfit2(prices));
    }

    @Test
    void maxProfit3() {
        int[] prices = {1, 3, 5};
        assertEquals(4, BestTimeToBuyAndSellStock3.maxProfit2(prices));
    }
}
package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void coinChange1() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        assertEquals(3, CoinChange.coinChange(coins, amount));
    }

    @Test
    void coinChange2() {
        int[] coins = new int[]{2};
        int amount = 3;
        assertEquals(-1, CoinChange.coinChange(coins, amount));
    }

    @Test
    void coinChange3() {
        int[] coins = new int[]{1};
        int amount = 0;
        assertEquals(0, CoinChange.coinChange(coins, amount));
    }
}
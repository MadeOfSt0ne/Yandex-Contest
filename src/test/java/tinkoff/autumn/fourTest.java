package tinkoff.autumn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fourTest {

    @Test
    void stealMoney1() {
        int n = 5;
        int[] money = {1, 2, 3, 5};
        assertEquals(0, four.stealMoney(n, money));
    }

    @Test
    void stealMoney2() {
        int n = 7;
        int[] money = {1, 2};
        assertEquals(0, four.stealMoney(n, money));
    }

    @Test
    void stealMoney3() {
        int n = 5;
        int[] money = {3, 4};
        assertEquals(0, four.stealMoney(n, money));
    }
}
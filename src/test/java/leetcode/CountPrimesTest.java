package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    @Test
    void countPrimes() {
        int n = 10;
        assertEquals(4, CountPrimes.countPrimes(n));
    }
}
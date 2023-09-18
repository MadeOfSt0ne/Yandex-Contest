package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt1() {
        String s = "IV";
        assertEquals(4, RomanToInteger.romanToInt(s));
    }

    @Test
    void romanToInt2() {
        String s = "LVIII";
        assertEquals(58, RomanToInteger.romanToInt(s));
    }

    @Test
    void romanToInt3() {
        String s = "MCMXCIV";
        assertEquals(1994, RomanToInteger.romanToInt(s));
    }
}
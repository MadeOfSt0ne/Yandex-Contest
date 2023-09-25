package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void intToRoman1() {
        int n = 1994;
        assertEquals("MCMXCIV", IntegerToRoman.intToRoman(n));
    }
}
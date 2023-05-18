package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneEditDistanceTest {

    @Test
    void isOneEditDistance() {
        String s = "string";
        String t = "sstring";
        assertTrue(OneEditDistance.isOneEditDistance(s, t));
    }
}
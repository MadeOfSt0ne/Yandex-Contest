package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {

    @Test
    void repeatedSubstringPattern1() {
        String s = "qweqweqwe";
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPattern2() {
        String s = "qqweqqwe";
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPattern3() {
        String s = "qweqwr";
        assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern(s));
    }
}
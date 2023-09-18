package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid1() {
        String s = "()";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    void isValid2() {
        String s = "([{}])";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    void isValid3() {
        String s = "([)";
        assertFalse(ValidParentheses.isValid(s));
    }
}
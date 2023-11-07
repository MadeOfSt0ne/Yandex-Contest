package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    @Test
    void backspaceCompare1() {
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(BackspaceStringCompare.backspaceCompare(s,t));
    }

    @Test
    void backspaceCompare2() {
        String s = "ab##";
        String t = "c#d#";
        assertTrue(BackspaceStringCompare.backspaceCompare(s,t));
    }
}
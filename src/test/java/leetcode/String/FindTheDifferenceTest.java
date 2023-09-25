package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    @Test
    void findTheDifference1() {
        String s = "abc";
        String t = "xbac";
        assertEquals('x', FindTheDifference.findTheDifference(s, t));
    }
}
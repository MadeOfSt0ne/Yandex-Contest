package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortVowelsInStringTest {

    @Test
    void sortVowels1() {
        String s = "lEetcOde";
        String ans = "lEOtcede";
        assertEquals(ans, SortVowelsInString.sortVowels(s));
    }

    @Test
    void sortVowels2() {
        String s = "lYmpH";
        String ans = "lYmpH";
        assertEquals(ans, SortVowelsInString.sortVowels(s));
    }

    @Test
    void sortVowels3() {
        String s = "RiQYo";
        String ans = "RiQYo";
        assertEquals(ans, SortVowelsInString.sortVowels(s));
    }
}
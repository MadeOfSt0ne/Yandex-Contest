package leetcode.String;

import leetcode.String.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }
    @Test
    void isPalindrome2() {
        String s = "race a car";
        assertFalse(ValidPalindrome.isPalindrome(s));
    }
    @Test
    void isPalindrome3() {
        String s = " ";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }
}
package leetcode.String;

public class ValidPalindrome {
    /**
     * Leetcode 125
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
     * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters
     * and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     */
    static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            if (!Character.isLetterOrDigit(currLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(currRight)) {
                right--;
            } else {
                if (currLeft != currRight) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

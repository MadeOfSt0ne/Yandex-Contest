package leetcode.String;

public class LengthOfLastWord {
    /**
     * Leetcode 58
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     */
    static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {

            } else if (s.charAt(i) == ' ' && count != 0) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}

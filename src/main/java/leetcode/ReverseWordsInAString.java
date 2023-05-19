package leetcode;

public class ReverseWordsInAString {
    /**
     * Leetcode 557
     * Given a string s, reverse the order of characters in each word within a sentence while still preserving
     * whitespace and initial word order.
     */
    static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

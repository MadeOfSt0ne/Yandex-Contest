package leetcode.String;

public class DecodedStringAtIndex {
    /**
     * Leetcode 880
     * You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a
     * time and the following steps are taken:
     * If the character read is a letter, that letter is written onto the tape.
     * If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
     * Given an integer k, return the kth letter (1-indexed) in the decoded string.
     */
    public String decodeAtIndex(String s, int k) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c - 'a' >= 0) {
                sb.append(c);
            } else {
                String curr = sb.toString().repeat(c);
                sb = new StringBuilder(curr);
            }
            if (sb.length() >= k) {
                result = String.valueOf(sb.toString().charAt(k - 1));
                break;
            }
        }
        return result;
    }
}

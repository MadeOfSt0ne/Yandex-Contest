package leetcode.String;

public class BackspaceStringCompare {
    /**
     * Leetcode 844
     * Given two strings 's' and 't', return 'true' if they are equal when both are typed into empty text editors.
     * '#' means a backspace character.
     */
    static boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!st.isEmpty()) {
                    st.deleteCharAt(st.length() - 1);
                }
            } else {
                st.append(t.charAt(i));
            }
        }

        return sb.toString().contentEquals(st);
    }
}

package leetcode.String;

public class ZigZagConversion {
    /**
     * Leetcode 6
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
     * display this pattern in a fixed font for better legibility)
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] strings = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            strings[i] = new StringBuilder();
        }
        int j = 0;
        int direction = 1;
        for(int i = 0; i < s.length(); i++) {
            strings[j].append(s.charAt(i));
            if (j == 0) {
                direction = 1;
            }
            if (j == numRows - 1) {
                direction = -1;
            }
            j += direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : strings) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int num = 3;
        System.out.println(convert(str, num));
    }
}

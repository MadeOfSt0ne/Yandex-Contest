package leetcode;

public class ExcelSheetColumnNumber {
    /**
     * Leetcode 171
     * Given a string 'columnTitle' that represents the column title as appears in an Excel sheet, return its
     * corresponding column number.
     */
    int titleNumber(String columnTitle) {
        int i = columnTitle.length() - 1;
        int ans = 0;
        int k = 1;
        while (i >= 0) {
            ans += (columnTitle.charAt(i) - '@') * k;
            k *= 26;
            i--;
        }
        return ans;
    }
}

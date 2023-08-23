package FallWinter22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_SneakyCipher {

    public static byte getCipher(String[] interns) {
        for (String s : interns) {
            String[] str = s.split(",");
            List<String> name = List.of(str[0], str[1], str[2]);
            int symbols = countName(name);
            int sumOfMonthAndDay = countDate(str[3], str[4]);
            int firstChar = (str[0].charAt(0) - 'A' + 1) * 256;
            int total = symbols + sumOfMonthAndDay + firstChar;
            String convert = Integer.toHexString(total);
            String withZeroes = "000" + convert;
            String key = withZeroes.substring(withZeroes.length() - 3);
            System.out.print(key.toUpperCase() + " ");
        }
        return 0;
    }

    private static int countDate(String day, String month) {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int sum = d % 10 + d / 10 + m % 10 + m / 10;
        return sum * 64;
    }

    private static int countName(List<String> name) {
        Set<Character> count = new HashSet<>();
        for (String s : name) {
            for (Character c : s.toCharArray()) {
                count.add(c);
            }
        }
        return count.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            String[] interns = new String[n];
            for (int i = 0; i < n; i++) {
                interns[i] = reader.readLine();
            }
            getCipher(interns);
        }
    }
}

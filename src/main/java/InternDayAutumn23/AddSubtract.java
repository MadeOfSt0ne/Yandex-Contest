package InternDayAutumn23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddSubtract {

    public static long addSubtract(String s) {
        if (!s.contains("+") && !s.contains("-")) {
            return Long.parseLong(s);
        }
        long ans = 0;
        int left = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
               String curr = s.substring(left, i);
               list.add(curr);
               left = i;
            }
            if (i == s.length() - 1) {
                String cu = s.substring(left);
                list.add(cu);
            }
        }

        for (String str : list) {
            char c = str.charAt(0);
            if (c == '+') {
                ans += Long.parseLong(str.substring(1));
            } else if (c == '-') {
                ans -= Long.parseLong(str.substring(1));
            } else {
                ans += Long.parseLong(str);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            System.out.println(addSubtract(s));
        }
    }
}

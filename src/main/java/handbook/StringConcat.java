package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConcat {
    static String concat(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();
            System.out.println(concat(s1, s2));
        }
    }
}

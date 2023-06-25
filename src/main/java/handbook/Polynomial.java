package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Polynomial {
    static byte findSum(int[] s1, int[] s2) {
        int a1 = s1.length - 1;
        int b1 = s2.length - 1;
        int[] ans = new int[Math.max(s1.length, s2.length)];
        if (s1.length >= s2.length) {
            for (int i = a1; i >= 0; i--) {
                if (b1 >= 0) {
                    ans[i] = s1[i] + s2[b1];
                } else {
                    ans[i] = s1[i];
                }
                b1--;
            }
        } else {
            for (int i = b1; i >= 0; i--) {
                if (a1 >= 0) {
                    ans[i] = s2[i] + s2[a1];
                } else {
                    ans[i] = s2[i];
                }
                a1--;
            }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            int[] s1 = readIntArray(br);
            int b = Integer.parseInt(br.readLine());
            int[] s2 = readIntArray(br);
            System.out.println(Math.max(a, b));
            findSum(s1, s2);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

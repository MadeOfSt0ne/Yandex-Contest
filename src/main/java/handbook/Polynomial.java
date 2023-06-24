package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Polynomial {
    static byte findSum(int a, int b, int[] s1, int[] s2) {
        System.out.println(Math.max(a, b));
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < s1.length; i++) {
            a1 = a1 * 10 + s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            b1 = b1 * 10 + s2[i];
        }
        int sum = a1 + b1;
        String str = String.valueOf(sum);
        for (char c : str.toCharArray()) {
            System.out.print(c + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            int[] s1 = readIntArray(br);
            int b = Integer.parseInt(br.readLine());
            int[] s2 = readIntArray(br);
            findSum(a, b, s1, s2);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

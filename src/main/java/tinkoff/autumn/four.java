package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class four {

    public static byte stealMoney(int sum, int[] money) {
        List<Integer> ans = new ArrayList<>();
        int[][] dp = new int[money.length][3];
        for (int i = 0; i < money.length; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = money[i] * j;
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] s = br.readLine().split(" ");
            int sum = Integer.parseInt(s[0]);
            int amount = Integer.parseInt(s[1]);
            int[] money = readArray(br);
            System.out.println(stealMoney(sum, money));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class taskC {

    static byte getProfit(int n, int[] prices) {
        int[] leftMaxProfit = new int[n];
        int[] rightMaxProfit = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftMaxProfit[i] = Math.max(leftMaxProfit[i - 1], prices[i] - minPrice);
        }
        for (int i : leftMaxProfit) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0 ; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightMaxProfit[i] = Math.max(rightMaxProfit[i + 1], maxPrice - prices[i]);
        }
        for (int j : rightMaxProfit) {
            System.out.print(j + ", ");
        }
        System.out.println();

        int profit = 0;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, rightMaxProfit[i] + leftMaxProfit[i]);
        }
        System.out.println("profit = " + profit);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] prices = readIntArray(br);
            getProfit(n, prices);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

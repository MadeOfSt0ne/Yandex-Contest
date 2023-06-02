package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BuySellStocks {

    static byte getProfit(int n, int[] prices) {
        int[] leftMaxProfit = new int[n];
        int[] rightMaxProfit = new int[n];
        Map<Integer, Transaction> left = new HashMap<>();
        Map<Integer, Transaction> right = new HashMap<>();
        List<Transaction> ans = new ArrayList<>();
        int minPrice = prices[0];
        int buy1 = 1;
        int sell1;
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buy1 = i + 1;
            }
            if (prices[i] - minPrice > leftMaxProfit[i - 1]) {
                leftMaxProfit[i] = prices[i] - minPrice;
                sell1 = i + 1;
                if (!left.containsKey(leftMaxProfit[i])) {
                    left.put(leftMaxProfit[i], new Transaction(buy1, sell1));
                }
            } else {
                leftMaxProfit[i] = leftMaxProfit[i - 1];
            }
        }

        System.out.print("Left max profit ");
        for (int i : leftMaxProfit) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (Integer i : left.keySet()) {
            System.out.println("Left profit = " + i + ". " + left.get(i));
        }

        int sell2 = prices.length;
        int buy2;
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0 ; i--) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                sell2 = i + 1;
            }
            if (maxPrice - prices[i] > rightMaxProfit[i + 1]) {
                rightMaxProfit[i] = maxPrice - prices[i];
                buy2 = i + 1;
                if (!right.containsKey(rightMaxProfit[i])) {
                    right.put(rightMaxProfit[i], new Transaction(buy2, sell2));
                }
            } else {
                rightMaxProfit[i] = rightMaxProfit[i + 1];
            }
        }

        System.out.print("Right max profit ");
        for (int j : rightMaxProfit) {
            System.out.print(j + ", ");
        }
        System.out.println();
        for (Integer i : right.keySet()) {
            System.out.println("Right profit = " + i + ". " + right.get(i));
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, rightMaxProfit[i] + leftMaxProfit[i]);
        }
        System.out.println("max profit = " + profit);
        if (left.containsKey(profit)) {
            ans.add(left.get(profit));
        } else {
            for (Integer i : left.keySet()) {
                if (right.containsKey(profit - i) && left.get(i).sell < right.get(profit - i).buy) {
                    ans.add(left.get(i));
                    ans.add(right.get(profit - i));
                    break;
                }
            }
        }
        System.out.println(ans.size());
        if (ans.size() == 1) {
            System.out.println(ans.get(0).buy + " " + ans.get(0).sell);
        } else if (ans.size() == 2) {
            ans.sort(Comparator.comparingInt(Transaction::buy));
            System.out.println(ans.get(0).buy + " " + ans.get(0).sell);
            System.out.println(ans.get(1).buy + " " + ans.get(1).sell);

        }
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

    record Transaction(int buy, int sell) {}
}

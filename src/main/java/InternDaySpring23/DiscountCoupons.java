package InternDaySpring23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DiscountCoupons {

    public static byte getBestCoupons(int[] nmk, int[] prices, List<int[]> coupons, int[] discounts) {
        Map<Integer, Double> disc = new HashMap<>();
        for (int i = 1; i <= discounts.length; i++) {
            disc.put(i, discounts[i - 1] / 100.0);
        }
        Map<Integer, Double> profit = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            if (coupons.get(i).length != 0) {
                for (int j = 1; j < coupons.get(i).length; j++) {
                    double prof = prices[i] * disc.get(coupons.get(i)[j]);
                    profit.put(coupons.get(i)[j], profit.getOrDefault(coupons.get(i)[j], 0.0) + prof);
                }
            }
        }
        Deque<Integer> ans = new ArrayDeque<>();
        for (Integer in : profit.keySet()) {
            if (ans.size() == 0) {
                ans.addLast(in);
            } else {
                if (profit.get(in) >= profit.get(ans.peekLast())) {
                    ans.addLast(in);
                } else {
                    ans.addFirst(in);
                }
            }
        }
        if (nmk[2] >= ans.size()) {
            System.out.println(ans.size());
            for (Integer inte : ans) {
                System.out.print(inte + " ");
            }
        } else {
            System.out.println(nmk[2]);
            for (int i = 0; i < nmk[2]; i++) {
                System.out.print(ans.pollLast() + " ");
            }
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmk = readIntArray(br);
            int[] prices = readIntArray(br);
            List<int[]> coupons = new ArrayList<>();
            for (int i = 0; i < prices.length; i++) {
                coupons.add(readIntArray(br));
            }
            int[] discounts = readIntArray(br);
            getBestCoupons(nmk, prices, coupons, discounts);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class four {

    public static byte stealMoney(int sum, int[] money) {
        int[] banknote = new int[money.length * 2];
        int[] stolen = new int[money.length * 2];
        int amount = 0;
        int pointer = 0;
        int k = money.length * 2 - 1;
        for (int m : money) {
            banknote[pointer] = m;
            pointer += 1;
            banknote[pointer] = m;
            pointer += 1;
        }
        for (int j = 2 * money.length - 1; j >= 0; j--) {
            if (banknote[j] <= sum && sum >= 0) {
                sum -= banknote[j];
                stolen[k--] = banknote[j];
                amount++;
            }
        }
        System.out.println("banknote: " + Arrays.toString(banknote));
        System.out.println("stolen: " + Arrays.toString(stolen));
        if (sum == 0) {
            System.out.println(amount);
            for (int j = 2 * money.length - 1; j >= 2 * money.length - amount; j--) {
                System.out.print(stolen[j] + " ");
            }
        } else {
            System.out.println("-1");
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

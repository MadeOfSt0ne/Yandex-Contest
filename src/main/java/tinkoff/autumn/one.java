package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class one {

    public static int findExpensive(int[] guns, int money) {
        int result = 0;
        for (int i : guns) {
            if (i <= money) {
                result = Math.max(result, i);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] nm = br.readLine().split(" ");
            int amount = Integer.parseInt(nm[0]);
            int money = Integer.parseInt(nm[1]);
            int[] guns = readArray(br);
            System.out.println(findExpensive(guns, money));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

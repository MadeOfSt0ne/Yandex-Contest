package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class t1 {

    static long countPrice(long[] abcd) {
        long cost = abcd[0];
        long paid = abcd[1];
        long priceOver = abcd[2];
        long planned = abcd[3];
        if (planned <= paid) {
            return cost;
        }
        return cost + (planned - paid) * priceOver;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] abcd = readIntArray(br);
            System.out.println(countPrice(abcd));
        }
    }

    private static long[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
    }
}

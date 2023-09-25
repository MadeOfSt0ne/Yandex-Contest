package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inheritance {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] prefSum = new int[n + 1];
            int max = 0;
            int idx = 0;
            for (int i = 1; i < prefSum.length; i++) {
                int parent = Integer.parseInt(br.readLine());
                prefSum[i] = 1 + prefSum[parent];
                if (prefSum[i] > max) {
                    max = prefSum[i];
                    idx = i;
                }
            }
            System.out.println(idx);
        }
    }
}

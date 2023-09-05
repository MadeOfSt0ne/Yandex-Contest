package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class five {

    public static int findLength(int towns, List<String> routes) {
        int[] maxLength = new int[towns];
        for (String s : routes) {
            String[] route = s.split(" ");
            int from = Integer.parseInt(route[0]) - 1;
            int to = Integer.parseInt(route[1]) - 1;
            int length = Integer.parseInt(route[2]);
            if (from != to) {
                maxLength[from] = Math.max(maxLength[from], length);
                maxLength[to] = Math.max(maxLength[to], length);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : maxLength) {
            if (i != 0) {
                min = Math.min(min, i);
            }
        }
        return min - 1;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            List<String> routes = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                routes.add(br.readLine());
            }
            System.out.println(findLength(n, routes));
        }
    }
}

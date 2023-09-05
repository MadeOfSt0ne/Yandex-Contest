package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task5 {

    public static int findLevel(int n, List<String> routes) {
        int[] minLvl = new int[n];
        for (String str : routes) {
            String[] s = str.split(" ");
            int one = Integer.parseInt(s[0]) - 1;
            int two = Integer.parseInt(s[1]) - 1;
            int level = Integer.parseInt(s[2]);
            minLvl[one] = Math.max(minLvl[one], level);
            minLvl[two] = Math.max(minLvl[two], level);
        }
        int min = Integer.MAX_VALUE;
        for (int i : minLvl) {
            min = Math.min(i, min);
        }
        return min;
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
            System.out.println(findLevel(n, routes));
        }
    }
}

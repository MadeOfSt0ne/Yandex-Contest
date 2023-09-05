package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E_LCP {

    public static long countLCPSum(List<int[]> arrays) {
        Map<Arr, Long> cache = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < arrays.size() - 1; i++) {
            for (int j = i + 1; j < arrays.size(); j++) {
                Arr arr = new Arr(arrays.get(i), arrays.get(j));
                if (cache.containsKey(arr)) {
                    sum += cache.get(arr);
                } else {
                    long lcp = LCP(arrays.get(i), arrays.get(j));
                    cache.put(arr, lcp);
                    sum += lcp;
                }
            }
        }
        return sum;
    }

    private static long LCP(int[] one, int[] two) {
        if (one.length > two.length) {
            //System.out.println("swapping arrays: " + one.length + " with " + two.length);
            return LCP(two, one);
        }
        long lcp = 0;
        for (int i = 0; i < one.length; i++) {
            if (one[i] == two[i]) {
                lcp++;
                //System.out.println("lcp = " + lcp);
            } else {
                //System.out.println("breaking with lcp = " + lcp);
                break;
            }
        }
        //System.out.println("returning lcp = " + lcp);
        return lcp;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            List<int[]> arrays = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(br.readLine());
                arrays.add(readIntArray(br));
            }

            System.out.println(countLCPSum(arrays));
        }
    }

    private static int[] readIntArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    record Arr(int[] one, int[] two) {}
}

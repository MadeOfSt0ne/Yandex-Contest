package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    static Map<Integer, Integer> cache = new HashMap<>();
    static Map<Integer, Integer> parents = new HashMap<>();

    static int countMax() {
        //Map<Integer, Integer> cache = new HashMap<>();
        int maxLen = 0;
        int ans = 0;
        for (Integer i : parents.keySet()) {
            int currLen = countLen(i);
            if (currLen > maxLen) {
                maxLen = currLen;
                ans = i;
            }
        }
        return ans;
    }

    private static int countLen(int i) {
        if (cache.containsKey(i)) {
            return cache.get(i);
        }
        if (parents.get(i) == 0) {
            cache.put(i, 1);
            return 1;
        }
        int len = 1 + countLen(parents.get(i));
        cache.put(i, len);
        return len;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            //Map<Integer, Integer> parents = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int parent = Integer.parseInt(br.readLine());
                parents.put(i, parent);
            }
            System.out.println(countMax());
        }
    }

    static int countMaxx() {
        int maxLength = 0;
        int answer = 0;
        int[] prefSum = new int[parents.size() + 1];
        for (int i = 1; i < prefSum.length; i++) {
            prefSum[i] = 1 + prefSum[parents.get(i)];
            if (prefSum[i] > maxLength) {
                maxLength = prefSum[i];
                answer = i;
            }
        }
        System.out.println(Arrays.toString(prefSum));
        return answer;
    }
}

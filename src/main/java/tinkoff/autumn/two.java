package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class two {

    public static int countSheriffs(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String sheriff = "sheriff";
        for (Character ch : sheriff.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Character ch : map.keySet()) {
            if (!ch.equals('f')) {
                min = Math.min(min, map.get(ch));
            } else {
                min = Math.min(min, map.get(ch) / 2);
            }
        }
        return min - 1;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            System.out.println(countSheriffs(s));
        }
    }
}

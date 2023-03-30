package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Sales {

    public static byte countGoods(List<String> arr) {
        List<String[]> sales = new ArrayList<>();
        for (String str : arr) {
            sales.add(str.split(" "));
        }

        Map<String, Long> map = new HashMap<>();
        for (String[] str : sales) {
            Long amount = map.getOrDefault(str[0] + " " + str[1], 0L);
            map.put(str[0] + " " + str[1], amount + Long.parseLong(str[2]));
        }

        Map<String, Map<String, Long>> sup = new HashMap<>();
        Map<String, Long> inner;
        Long tmp;
        for (String s : map.keySet()) {
            tmp = map.getOrDefault(s,0L);
            String[] tempName = s.split(" ");
            inner = sup.getOrDefault(tempName[0], new TreeMap<>());
            inner.put(tempName[1], tmp);
            sup.put(tempName[0], inner);
        }

        for (String zxc : new TreeSet<>(sup.keySet())) {
            System.out.println(zxc + ":");
            sup.get(zxc).forEach((key, value) -> System.out.println(key + " " + value));
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> arr = br.lines().collect(Collectors.toList());
            countGoods(arr);
        }
    }

}

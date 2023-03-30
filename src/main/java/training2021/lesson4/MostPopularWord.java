package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MostPopularWord {
    public static String findPopular(List<String> arr) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = arr.stream()
                .flatMap(Pattern.compile(" ")::splitAsStream)
                .collect(Collectors.toList());

        int count;
        for (String s : list) {
            count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }

        int maxRepeats = 1;
        for (Integer i : map.values()) {
            if (i > maxRepeats) {
                maxRepeats = i;
            }
        }

        List<String> repeats = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == maxRepeats) {
                repeats.add(key);
            }
        }
        repeats.sort(Comparator.naturalOrder());
        return repeats.get(0);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> arr = br.lines().collect(Collectors.toList());
            System.out.println(findPopular(arr));
        }
    }
}

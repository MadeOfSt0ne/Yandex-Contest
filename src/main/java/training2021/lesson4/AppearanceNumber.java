package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class AppearanceNumber {

    public static short countWords(List<String> arr) {
        Map<String, Integer> map = new HashMap<>();
        List<String[]> listtt = new ArrayList<>();
        for (String str : arr) {
            str = str.trim().replaceAll("\n", " ");
            listtt.add(str.split("\\s+"));
        }

        List<String> collect = listtt.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        int count;
        for (String s : collect) {
            count = map.getOrDefault(s, 0);
            System.out.print(count + " ");
            map.put(s, count + 1);
        }
        //System.out.println(System.lineSeparator() + "0 0 0 0 0 0 1 0 0 1 0 0 1 0 2 2 0 0 0 0 1 2 3 3 1 1 4 0 1 0 1 2 4 1 5 0 0");
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> arr = br.lines().collect(Collectors.toList());
            countWords(arr);
        }
    }
}

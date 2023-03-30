package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueWords {

    public static int countWords(List<String> arr) {

        List<String[]> listtt = new ArrayList<>();
        for (String str : arr) {
            str = str.trim().replaceAll("\n", "");
            listtt.add(str.split("\\s+"));
        }
        Set<String> set = listtt.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toSet());

        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> arr = br.lines().collect(Collectors.toList());
            int result = countWords(arr);
            System.out.println(result);
        }
    }
}

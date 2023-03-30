package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Polyglots {
    public static void countLanguages(int students, List<List<String>> languages) {
        Set<String> unique = languages.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        List<String> result = new ArrayList<>();
        boolean contains;
        for (String s : unique) {
            contains = true;
            for (List<String> str : languages) {
                if (!str.contains(s)) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                result.add(s);
            }
        }

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println(unique.size());
        for (String s : unique) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int students = readInt(br);
            List<List<String>> languages = new ArrayList<>();
            for (int i = 0; i < students; i++) {
                int current = readInt(br);
                List<String> curr = new ArrayList<>();
                for (int j = 0; j < current; j++) {
                    curr.add(readString(br));
                }
                languages.add(curr);
            }
            countLanguages(students, languages);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static String readString(BufferedReader br) throws IOException {
        return br.readLine();
    }
}

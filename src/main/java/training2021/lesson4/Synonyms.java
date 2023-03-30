package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Synonyms {

    public static String findSynonym(List<List<String>> words, String target) {
        Map<String, String> right = new HashMap<>();
        Map<String, String> left = new HashMap<>();
        for (List<String> list : words) {
            right.put(list.get(0), list.get(1));
            left.put(list.get(1), list.get(0));
        }
        for (String key : right.keySet()) {
            if (key.equals(target)) {
                return right.get(key);
            }
        }
        for (String key : left.keySet()) {
            if (key.equals(target)) {
                return left.get(key);
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int pairs = readInt(br);
            List<List<String>> words = new ArrayList<>();
            for (int i = 0; i < pairs; i++) {
                words.add(readList(br));
            }
            String target = readString(br);
            String result = findSynonym(words, target);
            System.out.println(result);
        }
    }

    private static List<String> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static String readString(BufferedReader br) throws IOException {
        return br.readLine();
    }
}

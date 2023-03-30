package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class WordStress {

    public static int countMistakes(List<String> rightWords, String target) {
        if (target.isBlank()) {
            return 0;
        }
        List<String> text = Arrays.stream(target.split(" ")).collect(Collectors.toList());
        int mistakes = text.size();

        Map<String, Integer> right = new HashMap<>();
        Map<String, Integer> wrong = new HashMap<>();
        Map<Character, Integer> chars = new HashMap<>();

        for (String str : rightWords) {
            right.put(str, 1);
            wrong.put(str.toLowerCase(), 1);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            chars.put(i, 1);
        }

        /*System.out.println("Wrong:");
        wrong.forEach((key, value) -> System.out.println("Key = " + key));
        System.out.println("Right:");
        right.forEach((key, value) -> System.out.println("Key = " + key));
        System.out.println("Text:");
        text.forEach(t -> System.out.print(t + " "));
        System.out.println(" ");*/

        for (String t : text) {
            //System.out.println("word = " + t);
            if (right.containsKey(t)) {
                mistakes--;
            } else if (wrong.containsKey(t.toLowerCase())) {
            } else {
                int counter = 0;
                for (Character c : t.toCharArray()) {
                    if (chars.containsKey(c)) {
                        counter++;
                    }
                }
                if (counter == 1) {
                    mistakes--;
                }
            }
        }
        return mistakes;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = readInt(br);
            List<String> words = new ArrayList<>(amount);
            for (int i = 0; i < amount; i++) {
                words.add(readString(br));
            }
            String target = readString(br);
            int result = countMistakes(words, target);
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

package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Keyboard {

    static int countTransitions(int[] keys, int[] rows, int[] text) {
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], rows[i]);
        }
        for (int j = 1; j < text.length; j++) {
            if (!Objects.equals(map.get(text[j - 1]), map.get(text[j]))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] keys = readArr(br);
            int[] rows = readArr(br);
            int k = Integer.parseInt(br.readLine());
            int[] text = readArr(br);
            System.out.println(countTransitions(keys, rows, text));
        }
    }

    private static int[] readArr(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

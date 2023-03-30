package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BullShit {

    public static int findPosition(Integer[] arr) {
        int targetPosition = 1;
        int winner = arr[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (valid(arr[i - 1], arr[i], arr[i + 1]) && !map.containsKey(arr[i - 1])) {
                map.put(arr[i - 1], arr[i]);
            }
            if (valid(arr[i - 1], arr[i], arr[i + 1]) && map.containsKey(arr[i - 1])) {
                if (arr[i] > map.get(arr[i - 1])) {
                    map.put(arr[i - 1], arr[i]);
                }
            }
            if (arr[i] > winner) {
                winner = arr[i];
            }
        }

        int vas = 0;
        if (map.containsKey(winner)) {
            vas = map.get(winner);
        }

        if (map.isEmpty() || vas == 0) {
            System.out.println("No solution: 0");
            return 0;
        }
        for (Integer w : arr) {
            if (w > vas) {
                targetPosition++;
            }
        }
        System.out.println("Position = " + targetPosition + ". Weight = " + vas);
        return targetPosition;
    }

    private static boolean valid(int maybeWinner, int vasilii, int looser) {
        return (maybeWinner >= vasilii) && (vasilii > looser) && (vasilii % 10 == 5);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = readInt(reader);
            Integer[] arr = readList(reader);
            int result = findPosition(arr);
            System.out.println(result);
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

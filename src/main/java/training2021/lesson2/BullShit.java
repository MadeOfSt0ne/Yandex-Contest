package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BullShit {

    public static int getPosition(Integer[] distances) {
        int topPosition = 1;
        int topDistance = 0;
        int winnerIndex = 0;
        int winnerDistance = distances[0];
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] > winnerDistance) {
                winnerIndex = i;
                winnerDistance = distances[i];
            }
        }
        for (int j = winnerIndex + 1; j < distances.length - 1; j++) {
            if (distances[j] % 10 == 5 && distances[j] > distances[j + 1]) {
                if (distances[j] > topDistance) {
                    topDistance = distances[j];
                }
            }
        }
        if (topDistance == 0) {
            return 0;
        }
        for (Integer dist : distances) {
            if (dist > topDistance) {
                topPosition++;
            }
        }
        return topPosition;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = readInt(reader);
            Integer[] arr = readList(reader);
            int result = getPosition(arr);
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

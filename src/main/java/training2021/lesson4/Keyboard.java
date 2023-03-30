package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Keyboard {

    public static short findBroken(Integer[] buttons, Integer[] pressing) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter;
        for (Integer press : pressing) {
            counter = map.getOrDefault(press, 0);
            map.put(press, counter + 1);
        }
        int bu;
        for (int i = 0; i < buttons.length; i++) {
            bu = buttons[i] - map.getOrDefault(i + 1, 0);
            //System.out.println("Button hp = " + bu);
            if (bu >= 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int buttonsAmount = readInt(br);
            Integer[] buttons = readList(br);
            int pressings = readInt(br);
            Integer[] pressing = readList(br);
            findBroken(buttons, pressing);
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
}

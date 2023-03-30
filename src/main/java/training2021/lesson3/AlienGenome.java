package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlienGenome {

    public static int countCommon(String first, String second) {
        List<String> listOne = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int counter;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < second.length() - 1; i++) {
            sb.append(second.toCharArray()[i]).append(second.toCharArray()[i + 1]);
            //counter = map.getOrDefault(sb.toString(), 0);
            map.put(sb.toString(), 1);
            sb.setLength(0);
        }
        for (int i = 0; i < first.length() - 1; i++) {
            sb.append(first.toCharArray()[i]).append(first.toCharArray()[i + 1]);
            listOne.add(sb.toString());
            sb.setLength(0);
        }
        int result = 0;
        for (String s : listOne) {
            result += map.getOrDefault(s, 0);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String first = readString(br);
            String second = readString(br);
            int result = countCommon(first, second);
            System.out.println(result);
        }
    }

    private static String readString(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}

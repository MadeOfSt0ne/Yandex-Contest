package InternDaySummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameWithChanges {

    public static byte changeLetters(String[] words) {
        for (int i = 0; i < words.length - 1; i = i + 2) {
            System.out.println(changeable(words[i], words[i + 1]) ? "YES" : "NO");
        }
        return 0;
    }

    private static boolean changeable(String a, String b) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character change1 = a.charAt(i);
            Character change2 = b.charAt(i);
            if (map1.put(change1, i) != map2.put(change2, i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] words = new String[n * 2];
            for (int i = 0; i < n * 2; i++) {
                words[i] = br.readLine();
            }
            changeLetters(words);
        }
    }
}

package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Abracadabra {

    static long countPower(int[] nk, String s, int[] pos, int[] move) {
        long counter = 0;
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, Integer> nextPosition = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            nextPosition.put(s.charAt(i), pos[i] - 1);
            map.put(s.charAt(i), move[i]);
        }

        for (int i = 0; i < s.length(); i++) {
            int[] current = new int[26];
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            int next = i;
            for (int j = 0; j < nk[1]; j++){
                var curr = s.charAt(next);
                next = nextPosition.get(curr);
                current[curr - 'a']++;

                if (set.contains(curr)) {
                    int k = curr - 'a';
                    int d = current[curr - 'a'] - 1;
                    int index = (k + d * map.get(curr)) % 26;
                    current[index]++;
                    curr = chars[index];
                }

                set.add(curr);
                sb.append(curr);
                System.out.println(sb);
                counter += set.size();
            }
        }
        System.out.println("power = " + counter);
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nk = readIntArray(br);
            String s = br.readLine();
            int[] pos = readIntArray(br);
            int[] move = readIntArray(br);
            System.out.println(countPower(nk, s, pos, move));
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B_Diversity {

    public static byte playGame(int[] cardsA, int[] cardsB, String[] changes) {
        int difference = cardsA.length + cardsB.length;
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        for (Integer i : cardsA) {
            mapA.put(i, mapA.getOrDefault(i, 0) + 1);
        }
        for (Integer j : cardsB) {
            mapB.put(j, mapB.getOrDefault(j, 0) + 1);
        }
        for (Integer key : mapA.keySet()) {
            if (mapB.containsKey(key)) {
                int a = mapA.get(key);
                int b = mapB.get(key);
                if (a == b) {
                    difference -= 2 * a;
                } else {
                    difference -= 2 * Math.abs(a - b);
                }
            }
        }
        //System.out.println("starting diff = " + difference);
        for (String s : changes) {
            String[] str = s.split(" ");
            int card = Integer.parseInt(str[2]);
            if (str[0].equals("1") && (str[1].equals("A") || str[1].equals("a"))) {
                if (mapB.containsKey(card) && mapA.getOrDefault(card, 0) < mapB.get(card)) {
                    difference--;
                } else {
                    difference++;
                }
                mapA.put(card, mapA.getOrDefault(card, 0) + 1);
                //System.out.println("Got 1 A with card = " + card + ". Diff = " + difference);
            } else if (str[0].equals("1") && (str[1].equals("B") || str[1].equals("b"))) {
                if (mapA.containsKey(card) && mapB.getOrDefault(card, 0) < mapA.get(card)) {
                    difference--;
                } else {
                    difference++;
                }
                mapB.put(card, mapB.getOrDefault(card, 0) + 1);
                //System.out.println("Got 1 B with card = " + card + ". Diff = " + difference);
            } else if (str[0].equals("-1") && (str[1].equals("A") || str[1].equals("a"))) {
                if (mapB.containsKey(card) && mapB.get(card) >= mapA.get(card)) {
                    difference++;
                } else {
                    difference--;
                }
                mapA.put(card, mapA.get(card) - 1);
                //System.out.println("Got -1 A with card = " + card + ". Diff = " + difference);
            } else if (str[0].equals("-1") && (str[1].equals("B") || str[1].equals("b"))) {
                if (mapA.containsKey(card) && mapA.get(card) >= mapB.get(card)) {
                    difference++;
                } else {
                    difference--;
                }
                mapB.put(card, mapB.get(card) - 1);
                //System.out.println("Got -1 B with card = " + card + ". Diff = " + difference);
            }
            System.out.print(difference + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmq = readArray(br);
            int[] cardsA = readArray(br);
            int[] cardsB = readArray(br);
            String[] changes = new String[nmq[2]];
            for (int i = 0; i < nmq[2]; i++) {
                changes[i] = br.readLine();
            }
            playGame(cardsA, cardsB, changes);
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

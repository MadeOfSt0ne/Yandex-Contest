package tinkoff.autumn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class three {

    public static String makeWinCombo(int[] joe, int[] win) {
         int left = 0;
         int right = joe.length - 1;
         while (left < joe.length && joe[left] == win[left]) {
             left++;
         }
         while (right >= 0 && joe[right] == win[right]) {
             right--;
         }
         if (left > right) {
             return "YES";
         } else {
             int[] subJoe = Arrays.copyOfRange(joe, left, right + 1);
             Arrays.sort(subJoe);
             int[] subWin = Arrays.copyOfRange(win, left, right + 1);
             if (Arrays.equals(subJoe, subWin)) {
                 return "YES";
             } else {
                 return "NO";
             }
         }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] joe = readArray(br);
            int[] win = readArray(br);
            System.out.println(makeWinCombo(joe, win));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

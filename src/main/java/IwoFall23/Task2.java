package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {

    static int countMin(int extra, int[] sizes) {
        Arrays.sort(sizes);
        int left = 0;
        int right = sizes.length - 1;
        int min = sizes[right] - sizes[left];
        if (extra == 0) {
            return min;
        }
        right -= extra;
        while (right < sizes.length) {
            int curr = sizes[right++] - sizes[left++];
            min = Math.min(min, curr);
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] nk = br.readLine().split(" ");
            int extra = Integer.parseInt(nk[1]);
            int[] sizes = readArray(br);
            System.out.println(countMin(extra, sizes));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

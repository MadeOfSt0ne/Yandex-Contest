package SpringSummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sculptures {

    static byte countS(long[] nxt, long[] sculptures) {
        long idealWeight = nxt[1];
        long timeLeft = nxt[2];
        List<Long> ans = new ArrayList<>();
        S[] scu = new S[sculptures.length];

        for (int i = 0; i < sculptures.length; i++) {
            scu[i] = new S(Math.abs(idealWeight - sculptures[i]), i + 1);
        }
        Arrays.sort(scu, Comparator.comparingLong(S::time));
        for (S s : scu) {
            timeLeft -= s.time;
            if (timeLeft >= 0) {
                ans.add(s.number);
            } else {
                break;
            }
        }

        System.out.println(ans.size());
        if (!ans.isEmpty()) {
            for (Long i : ans) {
                System.out.print(i + " ");
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] nxt = readIntArray(br);
            long[] sculptures = readIntArray(br);
            countS(nxt, sculptures);
        }
    }

    private static long[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
    }

    record S(long time, long number) {}
}

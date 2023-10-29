package YandexCup23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskA {

    public static long countSum(long[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        long ans = 0;
        long[] suf = new long[nums.length];
        suf[suf.length - 1] = nums[nums.length - 1];
        for (int i = suf.length - 2; i >= 0; i--) {
            suf[i] = nums[i] + suf[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];
            ans += curr * curr;
            if (i == nums.length - 1) {

            } else if (curr >= nums.length - i - 1) {
                ans += suf[i + 1];
            } else {
                ans = ans + suf[i + 1] - suf[(int) (i + 1 + curr)];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] nk = readArray(br);
            long[] nums = readArray(br);
            System.out.println(countSum(nums));
        }
    }

    private static long[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .filter(a -> a > 0)
                .toArray();
    }
}

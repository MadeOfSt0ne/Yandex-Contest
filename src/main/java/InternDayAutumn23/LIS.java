package InternDayAutumn23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LIS {

    public static int lis(int[] nb, int[] nums) {
        int b = nb[1];
        int[] dp = new int[nums.length];
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] >= nums[j] && nums[i] <= nums[j] + b) {
                    max = Math.max(dp[j], max);
                }
            }
            dp[i] = max + 1;
            result = Math.max(dp[i], result);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nb = readArray(br);
            int[] nums = readArray(br);
            System.out.println(lis(nb, nums));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

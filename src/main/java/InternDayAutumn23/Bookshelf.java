package InternDayAutumn23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Bookshelf {

    public static int countBooks(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        Deque<Integer> left = new ArrayDeque<>();
        Deque<Integer> right = new ArrayDeque<>();
        int l = copy[0];
        int r = copy[copy.length - 1];
        for (int curr : nums) {
            if (curr >= l && curr <= r) {
                if (curr - l < r - curr) {
                    left.addLast(curr);
                    l = curr;
                } else {
                    right.addFirst(curr);
                    r = curr;
                }
            }
        }
        return left.size() + right.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = readArray(br);
            System.out.println(countBooks(nums));
        }
    }

    private static int[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

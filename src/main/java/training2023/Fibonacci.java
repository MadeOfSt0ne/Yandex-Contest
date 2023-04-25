package training2023;

public class Fibonacci {

    private static long[] cache;

    public static long fibonacci(int target) {
        if (target <= 1) {
            return 1;
        }

        if (cache[target] != 0) {
            return cache[target];
        }

        long targetNumber = fibonacci(target - 1) + fibonacci(target - 2);
        cache[target] = targetNumber;

        return targetNumber;
    }

    public static void main(String[] args) {
        int target = 11;
        cache = new long[target + 1];
        System.out.println(target + "th fibonacci number is " + fibonacci(target));
    }
}

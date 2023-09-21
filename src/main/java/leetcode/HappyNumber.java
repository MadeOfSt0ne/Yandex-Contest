package leetcode;

public class HappyNumber {
    /**
     * Leetcode 202
     * Write an algorithm to determine if a number n is happy.
     * A happy number is a number defined by the following process:
     * Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does
     * not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
     */
    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            System.out.println("before: slow = " + slow + ". fast = " + fast);
            slow = square(slow);
            fast = square(square(fast));
            System.out.println("after: slow = " + slow + ". fast = " + fast);
        } while (slow != fast);
        return slow == 1;
    }

    private static int square(int n) {
        int ans = 0;

        while(n > 0) {
            int remainder = n % 10;
            ans += remainder * remainder;
            n /= 10;
        }

        return ans;
    }
}

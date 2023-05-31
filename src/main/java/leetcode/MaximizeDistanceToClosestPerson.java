package leetcode;

public class MaximizeDistanceToClosestPerson {
    /**
     * Leetcode 849
     * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith
     * seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
     * There is at least one empty seat, and at least one person sitting.
     * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
     * Return that maximum distance to the closest person.
     */
    static int maxDistanceToClosest(int[] seats) {
        if (seats.length == 2) {
            return 1;
        }
        int ans = 0;
        int prev = -1;
        int next = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                prev = i;
            } else {
                while (next < seats.length && seats[next] == 0 || next < i) {
                    next++;
                }
                int left = prev == -1 ? seats.length : i - prev;
                int right = next == seats.length ? seats.length : next - i;
                ans = Math.max(ans, Math.min(left, right));
            }
        }
        return ans;
    }

    static int maxDistanceToClosest2(int[] seats) {
        int max = -1;
        int prev = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (prev == -1) {
                    max = i;
                } else {
                    max = Math.max(max, (i - prev) / 2);
                }
                prev = i;
            }
        }
        max = Math.max(max, seats.length - 1 - prev);
        return max;
    }
}

package leetcode;

import java.util.Stack;

public class DailyTemperatures {
    /**
     * Ближайшее меньшее слева.
     * Leetcode 739
     * Given an array of integers temperatures represents the daily temperatures, return an array answer such that
     * answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no
     * future day for which this is possible, keep answer[i] == 0 instead.
     */
    int[] dailyTemperatures(int[] temperatures) {
        Stack<C> stack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().value <= temperatures[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                answer[i] = stack.peek().index - i;
            }
            stack.push(new C(temperatures[i], i));
        }
        return answer;
    }

    record C (int value, int index){}
}

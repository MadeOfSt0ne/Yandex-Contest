package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    /**
     * Leetcode
     * Given an integer n, return a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     */
    List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String sb = "";
            if (i % 3 == 0) {
                sb += "Fizz";
            }
            if (i % 5 == 0) {
                sb += "Buzz";
            }
            if (sb.isEmpty()) {
                sb += String.valueOf(i);
            }
            ans.add(sb);
        }
        return ans;
    }
}

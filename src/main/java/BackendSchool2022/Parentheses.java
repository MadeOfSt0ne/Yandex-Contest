package BackendSchool2022;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses {

    static int findIndex(String str) {
        int index = -1;
        Deque<A> deq = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                deq.addLast(new A(i, str.charAt(i)));
            } else if (str.charAt(i) == ')') {
                if (deq.size() >= 1 && deq.peekLast().ch == ')') {
                    return -1;
                } else if (deq.size() >= 1 && deq.peekLast().ch == '('){
                    deq.pollLast();
                } else if (deq.isEmpty()) {
                    deq.addLast(new A(i, str.charAt(i)));
                }
            }
        }
        if (deq.size() == 1) {
            index = deq.poll().index;
        }
        return index == -1 ? -1 : index + 1;
    }

    record A (int index, char ch) {}

    public static void main(String[] args) {
        String str1 = "a + b = b + a";
        String str2 = "d + (a + (b + c) = (a + b) + c + d";
        String str3 = ")ab + c) = ab + bc";
        System.out.println("index = " + findIndex(str3));
    }
}

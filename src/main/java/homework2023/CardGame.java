package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class CardGame {

    public static String findWinner(String one, String two) {
        Queue<Integer> firstQueue = Arrays.stream(one.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        Queue<Integer> secondQueue = Arrays.stream(two.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int currFirst;
        int currSecond;

        for (int i = 0; i < 1000000; i++) {
            if (firstQueue.size() == 0) {
                return "second " + i;
            } else if (secondQueue.size() == 0) {
                return "first " + i;
            }
            currFirst = firstQueue.poll();
            currSecond = secondQueue.poll();
            if (currFirst == 0 && currSecond == 9) {
                firstQueue.offer(currFirst);
                firstQueue.offer(currSecond);
            } else if (currSecond == 0 && currFirst == 9) {
                secondQueue.offer(currFirst);
                secondQueue.offer(currSecond);
            } else if (currFirst > currSecond) {
                firstQueue.offer(currFirst);
                firstQueue.offer(currSecond);
            } else {
                secondQueue.offer(currFirst);
                secondQueue.offer(currSecond);
            }
        }

        return "botva";
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String one = br.readLine().trim();
            String two = br.readLine().trim();
            System.out.println(findWinner(one, two));
        }
    }
}

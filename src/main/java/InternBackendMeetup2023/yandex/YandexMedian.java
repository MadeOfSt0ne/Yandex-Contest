package InternBackendMeetup2023.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class YandexMedian {

    public static byte findIndexes(String str) {
        Integer[] array = Arrays.stream(str.split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Integer[] result = new Integer[array.length];
        Arrays.fill(result, -1);

        for (int R = 1; R < array.length; R++) {
            Deque<Integer> values = new ArrayDeque<>();
            int index = 1;
            for (int L = 0; L <= R; L++) {
                values.offer(array[L]);
            }

            while (values.size() > 1) {
                int med = findMedian(values);
                if (med == array[R]) {
                    result[R] = index;
                    break;
                }
                values.poll();
                index++;
            }
        }

        for (Integer i : result) {
            System.out.print(i + " ");
        }
        return 0;
    }

    private static int findMedian(Deque<Integer> values) {
        int counter1 = 0;
        int counter0 = 0;
        for (Integer i : values) {
            if (i == 1) {
                counter1++;
            } else {
                counter0++;
            }
        }
        if (counter0 == counter1) {
            return -1;
        } else if (counter0 > counter1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            findIndexes(str);
        }
    }
}

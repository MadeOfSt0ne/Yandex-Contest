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
        Deque<Integer> values = new ArrayDeque<>();
        Deque<Integer> window = new ArrayDeque<>();
        window.offer(array[0]);
        int index;
        int median;

        for (int R = 1; R < array.length; R++) {
            window.offer(array[R]);
            index = 1;
            if (values.size() == window.size() - 1) {
                values.offer(array[R]);
            } else {
                values.clear();
            }
            values.addAll(window);
            while (values.size() > 1) {
                median = findMedian(values);
                if (median == array[R]) {
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
            String n = br.readLine();
            String str = br.readLine();
            findIndexes(str);
        }
    }
}

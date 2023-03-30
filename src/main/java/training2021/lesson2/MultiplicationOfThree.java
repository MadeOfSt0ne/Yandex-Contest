package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationOfThree {

    public static String findThree(List<Long> arr) {
        if (arr.size() == 3) {
            System.out.println("Result = " + arr.get(0) + " " + arr.get(1) + " " + arr.get(2));
            return arr.get(0) + " " + arr.get(1) + " " + arr.get(2);
        }
        Long[] sorted = sortThreeNumbers(arr.get(0), arr.get(1), arr.get(2));
        System.out.print("Sorted array: ");
        for (Long l : sorted) {
            System.out.print(l + ", ");
        }
        long biggest = sorted[2];
        long big = sorted[1];
        long third = sorted[0];
        long smallest = sorted[0];
        long small = sorted[1];

        for (int i = 3; i < arr.size(); i++) {
            if (biggest <= arr.get(i)) {
                third = big;
                big = biggest;
                biggest = arr.get(i);
            } else if (big <= arr.get(i) && arr.get(i) < biggest) {
                third = big;
                big = arr.get(i);
            } else if (third < arr.get(i)) {
                third = arr.get(i);
            } else if (arr.get(i) <= smallest) {
                small = smallest;
                smallest = arr.get(i);
            } else if (smallest < arr.get(i) && arr.get(i) < small) {
                small = arr.get(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (big * biggest > small * smallest) {
            sb.append(big).append(" ").append(biggest).append(" ").append(third);
        } else {
            sb.append(smallest).append(" ").append(small).append(" ").append(biggest);
        }
        System.out.println("Result = " + sb);
        return sb.toString();
    }

    public static String findThree2(Long[] arr) {
        if (arr.length == 3) {
            return arr[0] + " " + arr[1] + " " + arr[2];
        }
        Long[] sorted = sortThreeNumbers(arr[0], arr[1], arr[2]);

        long biggest = sorted[2];
        long big = sorted[1];
        long third = sorted[0];
        long smallest = sorted[0];
        long small = sorted[1];

        for (int i = 3; i < arr.length; i++) {
            if (arr[i] >= biggest) {
                third = big;
                big = biggest;
                biggest = arr[i];
            } else if (arr[i] >= big) {
                third = big;
                big = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            } else if (arr[i] <= smallest) {
                small = smallest;
                smallest = arr[i];
            } else if (arr[i] < small) {
                small = arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        if (big * biggest > small * smallest) {
            sb.append(big).append(" ").append(biggest).append(" ").append(third);
        } else {
            sb.append(smallest).append(" ").append(small).append(" ").append(biggest);
        }

        return sb.toString();
    }

    public static Long[] sortThreeNumbers(long first, long second, long third) {
        Long[] result = {first, second, third};
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    swapped = true;
                    long tmp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = tmp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //List<Long> arr = readList(reader);
            Long[] arr = readList2(reader);
            String result = findThree2(arr);
            System.out.println(result);
        }
    }

    private static List<Long> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }

    private static Long[] readList2(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }
}

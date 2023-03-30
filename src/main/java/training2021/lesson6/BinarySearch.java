package training2021.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

    public static byte search(Integer[] firstArray, Integer[] targetArray) {
        for (Integer x : targetArray) {
            int result = binarySearch(firstArray, x);
        }
        return 0;
    }

    private static int binarySearch(Integer[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                System.out.println("YES");
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("NO");
        return -1;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] nk = readList(br);
            Integer[] firstLine = readList(br);
            Integer[] targetLine = readList(br);

            search(firstLine, targetLine);
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

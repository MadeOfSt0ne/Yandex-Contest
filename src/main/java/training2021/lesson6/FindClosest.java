package training2021.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindClosest {
    public static byte search(Integer[] firstArray, Integer[] targetArray) {
        for (Integer x : targetArray) {
            int result = binarySearch(firstArray, x);
        }
        return 0;
    }

    private static int binarySearch(Integer[] arr, int x) {
        if (x >= arr[arr.length - 1]) {
            System.out.println(arr[arr.length - 1]);
            return 0;
        } else if (x <= arr[0]) {
            System.out.println(arr[0]);
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;
        int l = arr[left];
        int r = arr[right];
        //System.out.println("    New method call for X = " + x);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //System.out.println("Mid = " + mid + ", arr = " + arr[mid]);
            if (arr[mid] == x) {
                System.out.println(arr[mid]);
                return mid;
            }
            if (arr[mid] > x) {
                r = arr[mid];
                right = mid - 1;
            } else {
                l = arr[mid];
                left = mid + 1;
            }
        }
        if (findDistance(l, x) <= findDistance(r, x)) {
            System.out.println(l);
        } else {
            System.out.println(r);
        }
        return -1;
    }

    private static int findDistance(int big, int small) {
        if (big > small) {
            return big - small;
        }
        return small - big;
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

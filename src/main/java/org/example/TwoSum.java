package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    /**
     * Решение для отсортированного массива чисел
     */
    private static List<Integer> twoSum(List<Integer> arr, int targetSum) {
        List<Integer> result = new ArrayList<>();
        int left  = 0;
        int right = arr.size() - 1;
        while (left < right) {
            if (arr.get(left) + arr.get(right) == targetSum) {
                result.add(arr.get(left));
                result.add(arr.get(right));
                return result;
            } else if (arr.get(left) + arr.get(right) > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            List<Integer> arr = readList(reader);
            int targetSum = readInt(reader);
            List<Integer> result = twoSum(arr, targetSum);
            if (result.isEmpty()) {
                System.out.println("None");
            } else {
                System.out.println(result.get(0) + " " + result.get(1));
            }
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}

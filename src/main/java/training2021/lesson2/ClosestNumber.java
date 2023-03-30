package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClosestNumber {
    public static int findClosest(List<Integer> arr, int target) {
        if (arr.size() == 1) {
            return arr.get(0);
        }
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                return arr.get(i);
            }
            if (findRange2(arr.get(i), target) < findRange2(result, target)) {
                result = arr.get(i);
            }
        }
        return result;
    }

    private static int findRange2(int first, int target) {
        if (first == target) {
            return 0;
        }
        List<Integer> tmp = new ArrayList<>();
        if (first > target) {
            for (int i = target; i < first; i++) {
                tmp.add(1);
            }
        }
        if (target > first) {
            for (int i = first; i < target; i++) {
                tmp.add(1);
            }
        }
        return tmp.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int sizeOfArray = readInt(reader);
            List<Integer> arr = readList(reader);
            int target = readInt(reader);
            int result = findClosest(arr, target);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

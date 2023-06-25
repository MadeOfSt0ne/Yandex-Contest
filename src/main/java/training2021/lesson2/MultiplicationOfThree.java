package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MultiplicationOfThree {

    public static long findThree(Long[] numbers) {
        if (numbers.length == 3) {
            return numbers[0] * numbers[1] * numbers[2];
        }
        long big;
        long biggest;
        long small;
        long smallest;
        if (numbers[0] >= numbers[1]) {
            big = numbers[1];
            biggest = numbers[0];
            small = numbers[0];
            smallest = numbers[1];
        } else {
            big = numbers[0];
            biggest = numbers[1];
            small = numbers[1];
            smallest = numbers[0];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] >= biggest) {
                big = biggest;
                biggest = numbers[i];
            } else if (numbers[i] > big) {
                big = numbers[i];
            } else if (numbers[i] <= smallest) {
                small = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < small) {
                small = numbers[i];
            }
        }
        if (smallest * small >= big * biggest) {
            return smallest * small * biggest;
        }
        //int thirdMax = quickSelect(numbers, 0, numbers.length - 1, numbers.length - 3);
        return 0;
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];

        int pIndex = new Random().nextInt(right - left + 1) + left;
        pIndex = partition(nums, left, right, pIndex);

        if (pIndex == k) return nums[k];
        else if (pIndex < k) return quickSelect(nums, pIndex+1, right, k);
        return quickSelect(nums, left, pIndex-1, k);
    }

    private static int partition(int[] nums, int left, int right, int pIndex) {
        int pivot = nums[pIndex];
        swap(nums, pIndex, right);
        pIndex = left;

        for (int i=left; i<=right; i++)
            if (nums[i] <= pivot)
                swap(nums, i, pIndex++);

        return pIndex - 1;
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(reader.readLine());
            Long[] arr = readList2(reader);
            System.out.println(findThree(arr));
        }
    }

    private static Long[] readList2(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }
}

package training2021.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfNumbers {

    public static int countSum(Integer[] nk, Integer[] numbers) {
        int target = nk[1];
        int counter = 0;
        int left = 0;
        int right = 0;
        int sum = numbers[left];

        while (true) {
            System.out.println("Sum = " + sum + " at left = " + left + " ,right = " + right);
            if (sum == target) {
                counter++;
                System.out.println("Counter = " + counter);
                right++;
                System.out.println("Right >>");
                if (right == numbers.length) {
                    break;
                }
                sum = sum + numbers[right];
            } else if (sum < target) {
                right++;
                System.out.println("Right >>");
                if (right == numbers.length) {
                    break;
                }
                sum += numbers[right];
            } else {
                sum -= numbers[left];
                left++;
                System.out.println("Left >>");
                if (left == numbers.length) {
                    break;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] nk = readList(br);
            Integer[] numbers = readList(br);
            System.out.println(countSum(nk, numbers));
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

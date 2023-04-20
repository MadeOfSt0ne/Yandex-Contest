package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumInRectangle {

    public static byte findSum(Integer[][] array, List<Integer[]> k) {
        for (Integer[] arr : k) {
            int sum = 0;
            for (int i = arr[0] - 1; i < arr[2]; i++) {
                System.out.println("строка " + i);
                for (int j = arr[1] - 1; j < arr[3]; j++) {
                    System.out.println("столбец " + j);
                    System.out.println("значение = " + array[i][j]);
                    sum += array[i][j];
                }
            }
            System.out.println(sum);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] firstLine = readArrayInt(br);
            Integer[][] array = new Integer[firstLine[0]][firstLine[1]];
            for (int i = 0; i < firstLine[0]; i++) {
                array[i] = readArrayInt(br);
            }
            List<Integer[]> k = new ArrayList<>();
            for (int j = 0; j < firstLine[2]; j++) {
                k.add(readArrayInt(br));
            }
            findSum(array, k);
        }
    }

    private static Integer[] readArrayInt(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

}

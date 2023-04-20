package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinRectangle {

    public static byte findMinRectangle(List<Integer[]> list) {
        int minX = list.get(0)[0];
        int minY = list.get(0)[1];
        int maxX = list.get(0)[0];
        int maxY = list.get(0)[1];

        for (Integer[] array : list) {
            if (array[0] < minX) {
                minX = array[0];
            } else if (array[0] > maxX) {
                maxX = array[0];
            }
            if (array[1] < minY) {
                minY = array[1];
            } else if (array[1] > maxY) {
                maxY = array[1];
            }
        }

        System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(br);
            List<Integer[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(readArrayInt(br));
            }
            findMinRectangle(list);
        }
    }

    private static Integer[] readArrayInt(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}

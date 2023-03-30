package training2021.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tourism {

    public static byte countHeight(List<Integer[]> peaks, List<Integer[]> traces) {
        Integer[] heights = new Integer[peaks.size()];
        for (int i = 0; i < peaks.size(); i++) {
            heights[i] = peaks.get(i)[1];
        }
        for (Integer[] trace : traces) {
            int sumOfHeights = 0;
            int start = trace[0];
            int end = trace[1];
            //System.out.println("Start = " + start + ", end = " + end);
            if (start == end) {
                System.out.println(0);
                continue;
            } else if (start > end) {
                for (int i = start - 1; i >= end; i--) {
                    if (heights[i] < heights[i - 1]) {
                        sumOfHeights = sumOfHeights + heights[i - 1] - heights[i];
                        //System.out.print(sumOfHeights + " ");
                    }
                }
            } else {
                for (int i = start - 1; i < end - 1; i++) {
                    if (heights[i] < heights[i + 1]) {
                        sumOfHeights = sumOfHeights + heights[i + 1] - heights[i];
                        //System.out.print(sumOfHeights + " ");
                    }
                }
            }
            System.out.println(sumOfHeights);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer[]> peaks = new ArrayList<>();
            List<Integer[]> traces = new ArrayList<>();
            int size = readInt(br);
            for (int i = 0; i < size; i++) {
                peaks.add(readList(br));
            }
            int size2 = readInt(br);
            for (int j = 0; j < size2; j++) {
                traces.add(readList(br));
            }
            countHeight(peaks, traces);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

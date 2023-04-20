package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {

    public static int solveTaskE(List<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        int L = list.size() - 1;
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(br);
            List<Integer> list = readArrayInt(br);
            for (int i = 0; i < N; i++) {
                list.add(readInt(br));
            }
            System.out.println(solveTaskE(list));
        }
    }

    private static List<Integer> readArrayInt(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<String> readListString(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static String readString(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}

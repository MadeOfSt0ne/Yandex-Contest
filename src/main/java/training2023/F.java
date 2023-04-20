package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F {

    public static int solveTaskF(int sectors, List<Integer[]> list) {
        if (sectors <= 1) {
            return sectors;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            //System.out.println("sectors before = " + sectors);
            for (int j = i + 1; j < list.size(); j++) {
                if (crosses(list.get(i), list.get(j))) {
                    sectors -= 1;
                    break;
                }
                //System.out.println("sectors = " + sectors);
            }
        }
        //System.out.println(" total = " + sectors);
        return sectors;
    }

    private static boolean crosses(Integer[] one, Integer[] two) {
        return (one[0] >= two[0] && one[0] <= two[1]) || (one[1] >= two[0] && one[1] <= two[1]);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sectors = readInt(br);
            int chapters = readInt(br);
            List<Integer[]> list = new ArrayList<>();
            for (int i = 0; i < chapters; i++) {
                list.add(readArrayInt(br));
            }
            System.out.println(solveTaskF(chapters, list));
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

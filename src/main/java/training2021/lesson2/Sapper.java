package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sapper {

    public static byte makeField(Integer[] array, List<Mine> mines) {
        String[][] field = new String[array[0] + 2][array[1] + 2];
        Arrays.stream(field).forEach(a -> Arrays.fill(a, "0"));
        if (mines.size() == 0) {
            return printField(array, field);
        }
        Integer xx;
        Integer yy;
        int replace;
        for (Mine m : mines) {
            xx = m.getX();
            yy = m.getY();
            field[xx][yy] = "*";
            for (int i = xx - 1; i <= xx + 1; i++) {
                for (int j = yy - 1; j <= yy + 1; j++) {
                    if (!field[i][j].equals("*")) {
                        replace = Integer.parseInt(field[i][j]);
                        field[i][j] = String.valueOf(replace + 1);
                    }
                }
            }
        }
        printField(array, field);
        return 0;
    }

    private static byte printField(Integer[] array, String[][] field) {
        for (int i = 1; i <= array[0]; i++) {
            for (int j = 1; j <= array[1]; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] array = readIntArray(br);
            List<Mine> mines = new ArrayList<>();
            for (int i = 0; i < array[2]; i++) {
                Integer[] mine = readIntArray(br);
                mines.add(new Mine(mine[0], mine[1]));
            }
            makeField(array, mines);
        }
    }

    private static Integer[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    public static class Mine {
        private final Integer x;
        private final Integer y;
        Mine(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public Integer getY() {
            return y;
        }
    }
}

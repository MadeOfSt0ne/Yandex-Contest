package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

    public static int countCells(int n) {
        if (n == 1) {
            return 1;
        }
        return n * 4 - 4;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(countCells(n));
        }
    }
}

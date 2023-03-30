package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

    private static boolean canBuild(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int sideA = readInt(reader);
            int sideB = readInt(reader);
            int sideC = readInt(reader);

            boolean result = canBuild(sideA, sideB, sideC);
            System.out.println(result ? "YES" : "NO");
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

}

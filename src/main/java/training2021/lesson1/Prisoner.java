package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prisoner {

    public static boolean canThrow(int A, int B, int C, int D, int E) {
        return A <= D && B <= E || A <= D && C <= E || B <= D && C <= E ||
                A <= E && B <= D || A <= E && C <= D || B <= E && C <= D;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int A = readInt(reader);
            int B = readInt(reader);
            int C = readInt(reader);
            int D = readInt(reader);
            int E = readInt(reader);

            boolean result = canThrow(A, B, C, D, E);
            System.out.println(result ? "YES" : "NO");
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

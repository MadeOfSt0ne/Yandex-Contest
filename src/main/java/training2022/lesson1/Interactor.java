package training2022.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interactor {

    public static int findVerdict(int code, int interactor, int checker) {
        switch (interactor) {
            case 0:
                return code == 0 ? checker : 3;
            case 1:
                return checker;
            case 4:
                return code == 0 ? 4 : 3;
            case 6:
                return 0;
            case 7:
                return 1;
            default:
                return interactor;
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int code = readInt(br);
            int interactor = readInt(br);
            int checker = readInt(br);
            System.out.println(findVerdict(code, interactor, checker));
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}

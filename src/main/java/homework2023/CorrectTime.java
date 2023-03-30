package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectTime {

    public static byte solveTaskG(String A, String B, String C) {
        String[] timeA = A.split(":");
        String[] timeB = B.split(":");
        String[] timeC = C.split(":");
        double absTimeA = Integer.parseInt(timeA[0]) * 60 * 60 + Integer.parseInt(timeA[1]) * 60 + Integer.parseInt(timeA[2]);
        double absTimeB = Integer.parseInt(timeB[0]) * 60 * 60 + Integer.parseInt(timeB[1]) * 60 + Integer.parseInt(timeB[2]);
        double absTimeC = Integer.parseInt(timeC[0]) * 60 * 60 + Integer.parseInt(timeC[1]) * 60 + Integer.parseInt(timeC[2]);

        if (absTimeC == absTimeA) {
            System.out.println(B);
            return 0;
        }
        if (absTimeC < absTimeA) {
            absTimeC = absTimeC + 24 * 60 * 60;
        }
        double diff = Math.round((absTimeC - absTimeA) / 2);
        absTimeB = absTimeB + diff;
        String seco;
        String minu;
        String hou;
        double sec = absTimeB % 60;
        if (sec < 10) {
             seco = ("0" + (int) sec);
        } else {
             seco = String.valueOf((int) sec);
        }
        double minute = absTimeB / 60;
        double plusMin = minute % 60;
        if (plusMin < 10) {
            minu = ("0" + (int) plusMin);
        } else {
            minu = String.valueOf((int) plusMin);
        }
        double hour = minute / 60;
        if (hour >= 24) {
            hour = hour - 24;
        }
        if (hour < 10) {
            hou = ("0" + (int) hour);
        } else {
            hou = String.valueOf((int) hour);
        }

        System.out.println(hou + ":" + minu + ":" + seco);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String A = readString(br);
            String B = readString(br);
            String C = readString(br);
            solveTaskG(A, B, C);
        }
    }

    private static String readString(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}

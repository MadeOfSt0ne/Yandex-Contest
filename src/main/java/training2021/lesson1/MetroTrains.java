package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetroTrains {

    private static String countTrains(int intervalA, int intervalB, int trainsA, int trainsB) {

        int minA = trainsA + (trainsA - 1) * intervalA;
        int minB = trainsB + (trainsB - 1) * intervalB;
        int maxA = trainsA + (trainsA + 1) * intervalA;
        int maxB = trainsB + (trainsB + 1) * intervalB;

        int largestMin = Math.max(minA, minB);
        int smallestMax = Math.min(maxA, maxB);

        if (smallestMax < largestMin) {
            return "-1";
        }

        return largestMin + " " + smallestMax;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int intervalA = readInt(reader);
            int intervalB = readInt(reader);
            int trainsA = readInt(reader);
            int trainsB = readInt(reader);

            String result = countTrains(intervalA, intervalB, trainsA, trainsB);
            System.out.println(result);
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

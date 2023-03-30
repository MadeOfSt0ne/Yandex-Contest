package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AirConditioner {

    private static int countTemperature(List<Integer> temps, String mode) {
        int tRoom = temps.get(0);
        int tCond = temps.get(1);
        switch (mode) {
            case ("fan") :
                return tRoom;
            case ("auto") :
                return tCond;
            case ("freeze") :
                return Math.min(tCond, tRoom);
            case ("heat") :
                return Math.max(tCond, tRoom);
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> arr = readList(reader);
            String mode = readString(reader);
            Integer result = countTemperature(arr, mode);
            System.out.println(result);
        }
    }

    private static String  readString(BufferedReader reader) throws IOException {
        return reader.readLine();
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}

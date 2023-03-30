package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ambulance {

    public static String findLevel(List<Integer> arr) {
        int targetFlat = arr.get(0);
        int levels = arr.get(1);
        double prevFlat = arr.get(2);
        int prevEntrance = arr.get(3);
        int prevLevel = arr.get(4);
        long targetLevel;
        long targetEntrance;

        if (prevEntrance == 1 && prevLevel == 1) {
            targetEntrance = 0;
            if (levels == 1) {
                targetLevel = 1;
            } else {
                targetLevel = 0;
            }
            return targetEntrance + " " + targetLevel;
        }

        int absLevel = (prevEntrance - 1) * levels + prevLevel;
        double flatsPerLvl = prevFlat / absLevel;
        if (flatsPerLvl < 1) {
            return "-1 -1";
        }
        long flatsPerLevel = Math.round(prevFlat / absLevel);
        System.out.println("Flats per level = " + flatsPerLevel);
        long absolutLevel = targetFlat / flatsPerLevel;
        if (targetFlat % flatsPerLevel >= 1) {
            absolutLevel += 1;
        }
        System.out.println("Abs level = " + absolutLevel);
        targetEntrance = absolutLevel / levels + 1;
        System.out.println("Target entrance = " + targetEntrance);
        while (absolutLevel > levels) {
            absolutLevel = absolutLevel - levels;
            System.out.println("Temp level = " + absolutLevel);
        }

        targetLevel = absolutLevel;
        System.out.println("Target level = " + targetLevel);

        return targetEntrance + " " + targetLevel;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> arr = readList(reader);
            String result = findLevel(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}

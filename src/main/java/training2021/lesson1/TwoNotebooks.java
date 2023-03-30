package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoNotebooks {
    //5 7 3 2
    public static String findArea(List<Integer> sides) {
        int sideA1 = sides.get(0);
        int sideB1 = sides.get(1);
        int sideA2 = sides.get(2);
        int sideB2 = sides.get(3);
        Map<Integer, Table> areas = new HashMap<>();

        int area1 = (sideA1 + sideA2) * Math.max(sideB1, sideB2);
        areas.put(area1, new Table((sideA1 + sideA2), Math.max(sideB1, sideB2)));
        System.out.println(areas.get(area1));

        int area2 = (sideA1 + sideB2) * Math.max(sideA2, sideB1);
        areas.put(area2, new Table((sideA1 + sideB2), Math.max(sideA2, sideB1)));
        System.out.println(areas.get(area2));

        int area3 = (sideB1 + sideA2) * Math.max(sideA1, sideB2);
        areas.put(area3, new Table((sideA2 + sideB1), Math.max(sideA1, sideB2)));
        System.out.println(areas.get(area3));

        int area4 = (sideB1 + sideB2) * Math.max(sideA1, sideA2);
        areas.put(area4, new Table((sideB2 + sideB1), Math.max(sideA2, sideA1)));
        System.out.println(areas.get(area4));

        int smallestArea = area1;
        for (Integer i : areas.keySet()) {
            if (i < smallestArea) {
                smallestArea = i;
            }
        }
        System.out.println(areas.get(smallestArea).sideA + " " + areas.get(smallestArea).sideB);
        return areas.get(smallestArea).sideA + " " + areas.get(smallestArea).sideB;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> arr = readList(reader);
            String result = findArea(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    static class Table {
        int sideA;
        int sideB;

        public Table(int sideA, int sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "sideA=" + sideA +
                    ", sideB=" + sideB +
                    '}';
        }
    }
}

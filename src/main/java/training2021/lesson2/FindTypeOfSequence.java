package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindTypeOfSequence {

    public static String findType(List<Long> arr) {
        boolean found = false;
        List<Long> longs = new ArrayList<>();
        for (Long lo : arr) {
            if (lo == -2000000000) {
                found = true;
            }
            if (!found) {
                longs.add(lo);
            }
        }

        String result = "CONSTANT";
        boolean asc = false;
        boolean desc = false;
        boolean equal = false;

        if (longs.size() <= 1) {
            return "CONSTANT";
        }

        for (int i = 0; i < longs.size() - 1; i++) {
            if (longs.get(i) < longs.get(i + 1)) {
                asc = true;
            }
            if (longs.get(i) > longs.get(i + 1)) {
                desc = true;
            }
            if (Objects.equals(longs.get(i), longs.get(i + 1))) {
                equal = true;
            }
        }

        System.out.println("ASC = " + asc + ". DESC = " + desc + ". EQUAL = " + equal);

        if (asc && desc) {
            return "RANDOM";
        }
        if (asc && equal) {
            return  "WEAKLY ASCENDING";
        }
        if (asc) {
            return "ASCENDING";
        }
        if (desc && equal) {
            return "WEAKLY DESCENDING";
        }
        if (desc) {
            return "DESCENDING";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Long> arr = new ArrayList<>();
            while (reader.ready()) {
                arr.add(readLong(reader));
            }
            String result = findType(arr);
            System.out.println(result);
        }
    }

    private static Long readLong(BufferedReader reader) throws IOException {
        return Long.parseLong(reader.readLine());
    }
}

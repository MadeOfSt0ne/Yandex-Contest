package training2021.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StylishWear {

    public static short findClosest(Integer[] shirts, Integer[] pants) {
        int diff;
        int sh = shirts[0];
        int pa = pants[0];
        int smallest = shirts[0] - pants[0];
        if (smallest < 0) {
            smallest *= -1;
        }
        if (shirts[0] >= pants[pants.length - 1]) {
            System.out.println(shirts[0] + " " + pants[pants.length - 1]);
            return 0;
        }
        if (shirts[shirts.length - 1] <= pants[0]) {
            System.out.println(shirts[shirts.length - 1] + " " + pants[0]);
            return 0;
        }
        for (Integer shirt : shirts) {
            for (Integer pant : pants) {
                if (shirt == pant) {
                    System.out.println(shirt + " " + pant);
                    return 0;
                } else if (shirt > pant) {
                    diff = shirt - pant;
                    if (smallest > diff) {
                        smallest = diff;
                        sh = shirt;
                        pa = pant;
                    }
                } else {
                    diff = pant - shirt;
                    if (smallest > diff) {
                        smallest = diff;
                        sh = shirt;
                        pa = pant;
                    }
                    break;
                }
            }
        }
        System.out.println(sh + " " + pa);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int size1 = readInt(br);
            Integer[] shirts = readList(br);
            int size2 = readInt(br);
            Integer[] pants = readList(br);
            findClosest(shirts, pants);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

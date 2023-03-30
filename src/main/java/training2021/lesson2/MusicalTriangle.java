package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class MusicalTriangle {

    public static String findRange(List<Record> arr) {
        float lower = 30.0F;
        float higher = 4000.0F;
        float diff;
        float tmp;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).getPosition().equals("closer") && arr.get(i).getFreq() > arr.get(i - 1).getFreq()) {
                diff = arr.get(i).getFreq() - arr.get(i - 1).getFreq();
                tmp = arr.get(i).getFreq() - diff / 2;
                if (tmp > lower) {
                    lower = tmp;
                }
            }
            if (arr.get(i).getPosition().equals("closer") && arr.get(i).getFreq() < arr.get(i - 1).getFreq()) {
                diff = arr.get(i - 1).getFreq() - arr.get(i).getFreq();
                tmp = arr.get(i).getFreq() + diff / 2;
                if (tmp < higher) {
                    higher = tmp;
                }
            }
            if (arr.get(i).getPosition().equals("further") && arr.get(i).getFreq() > arr.get(i - 1).getFreq()) {
                diff = arr.get(i).getFreq() - arr.get(i - 1).getFreq();
                tmp = arr.get(i).getFreq() - diff / 2;
                if (tmp < higher) {
                    higher = tmp;
                }
            }
            if (arr.get(i).getPosition().equals("further") && arr.get(i).getFreq() < arr.get(i - 1).getFreq()) {
                diff = arr.get(i - 1).getFreq() - arr.get(i).getFreq();
                tmp = arr.get(i).getFreq() + diff / 2;
                if (tmp > lower) {
                    lower = tmp;
                }
            }
            //System.out.println("Step " + i + ": lower = " + lower + ", higher = " + higher);
        }
        //System.out.println("Final: lower = " + lower + ", higher = " + higher + "\n");
        return lower + " " + higher;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = readInt(reader);
            float first = Float.parseFloat(reader.readLine());
            List<Record> arr = new ArrayList<>();
            arr.add(new Record(first, "s"));
            for (int i = 0; i < size - 1; i++) {
                List<String> list = readList(reader);
                arr.add(new Record(Float.parseFloat(list.get(0)), list.get(1).toLowerCase()));
            }
            String result = findRange(arr);
            System.out.println(result);
        }
    }

    private static List<String> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static class Record {
        private final float freq;
        private final String position;

        public Record(float freq, String position) {
            this.freq = freq;
            this.position = position;
        }

        public float getFreq() {
            return freq;
        }

        public String getPosition() {
            return position;
        }
    }
}

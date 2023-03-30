package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Cubes {

    public static void findIntersections(List<Integer> ann, List<Integer> boris) {

        /*List<Integer> intersections = new ArrayList<>();
        List<Integer> borisLeft = new ArrayList<>();

        Map<Integer, Integer> cache = new HashMap<>();*/

        /*for (Integer i : ann) {
            cache.put(i, 1);
        }
        for (Integer j : boris) {
            if (cache.containsKey(j)) {
                intersections.add(j);
                cache.remove(j);
            } else {
                borisLeft.add(j);
            }
        }*/

        List<Integer> inters = ann.stream()
                .filter(boris::contains)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Integer[] annnn = ann.stream()
                .filter(o -> !inters.contains(o))
                .sorted(Comparator.naturalOrder())
                .toArray(Integer[]::new);

        Integer[] borrrr = boris.stream()
                .filter(o -> !inters.contains(o))
                .sorted(Comparator.naturalOrder())
                .toArray(Integer[]::new);

        /*Integer[] an = cache.keySet().toArray(new Integer[0]);
        Integer[] inter = intersections.toArray(new Integer[0]);
        Integer[] bor = borisLeft.toArray(new Integer[0]);

        Arrays.sort(an);
        Arrays.sort(inter);
        Arrays.sort(bor);*/

        System.out.println(inters.size());
        for (Integer p : inters){
            System.out.print(p + " ");
        }
        System.out.println(System.lineSeparator() + annnn.length);
        for (Integer o : annnn){
            System.out.print(o + " ");
        }
        System.out.println(System.lineSeparator() + borrrr.length);
        for (Integer l : borrrr){
            System.out.print(l + " ");
        }

    }

    private static void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return  i + 1;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> amount = readList(reader);
            List<Integer> ann = new ArrayList<>();
            List<Integer> boris = new ArrayList<>();
            for (int i = 0; i < amount.get(0); i++) {
                ann.add(readInt(reader));
            }
            for (int j = 0; j < amount.get(1); j++) {
                boris.add(readInt(reader));
            }
            findIntersections(ann, boris);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

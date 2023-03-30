package training2021.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueTrees {
    public static byte countTrees(Integer[] nk, Integer[] trees) {
        if (Objects.equals(nk[0], nk[1])) {
            System.out.println(1 + " " + nk[0]);
            return 0;
        }
        if (nk[1] == 1) {
            System.out.println("1 1");
            return 0;
        }
        int left = 0;
        int right = 1;
        int minSize = nk[1];
        int tmpSize = nk[0];
        Set<Integer> tempSet = new HashSet<>();

        for (int i = 0; i <= trees.length - minSize; i++) {
            tempSet.add(trees[i]);
            System.out.println("Entering outer cycle with i = " + i);
            for (int j = i + 1; j < trees.length; j++) {
                tempSet.add(trees[j]);
                int currDist = j - i + 1;
                System.out.println("Curr length = " + currDist);
                if (currDist < minSize) {
                    continue;
                }
                if (tempSet.size() == minSize && currDist == minSize) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return 0;
                }
                if (tempSet.size() == minSize && currDist <= tmpSize) {
                    left = i + 1;
                    right = j + 1;
                    tmpSize = currDist;
                    System.out.println("Right index = " + right + ", Left index = " + left + ", minDist = " + tmpSize);
                }
            }
            tempSet.clear();
        }
        System.out.println(left + " " + right);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] nk = readList(br);
            Integer[] trees = readList(br);
            countTrees(nk, trees);
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

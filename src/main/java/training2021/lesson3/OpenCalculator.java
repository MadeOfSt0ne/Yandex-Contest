package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OpenCalculator {

    public static int countButtons(List<Integer> buttons, Integer number) {
        Set<Integer> set = new HashSet<>();
        while (number > 0) {
            int digit = number % 10;
            if (digit != buttons.get(0) && digit != buttons.get(1) && digit != buttons.get(2)) {
                set.add(digit);
            }
            number = number / 10;
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            List<Integer> buttons = readList(br);
            Integer number = readString(br);
            int result = countButtons(buttons, number);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static Integer readString(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}

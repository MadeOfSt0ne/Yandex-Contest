package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {

    private static List<String> isEqualNumber(List<String> phoneBook) {
        List<String> result = new ArrayList<>();
        List<String> corrected = new ArrayList<>();
        for (String s : phoneBook) {
            String one = s
                    .replaceAll("\\+7", "8")
                    .replaceAll("-", "")
                    .replaceAll("\\(", "")
                    .replaceAll("\\)", "");
            if (one.length() < 11) {
                one = "8495" + one;
            }
            corrected.add(one);
        }
        for (int i = 1; i < 4; i++) {
            if (corrected.get(0).equals(corrected.get(i))) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> phoneBook = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                phoneBook.add(readString(reader));
            }
            List<String> result = isEqualNumber(phoneBook);
            result.forEach(System.out::println);
        }
    }

    private static String  readString(BufferedReader reader) throws IOException {
        return reader.readLine();
    }

}

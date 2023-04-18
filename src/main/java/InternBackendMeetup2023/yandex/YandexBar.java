package InternBackendMeetup2023.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class YandexBar {

    public static byte makeCocktail(String[] glass, String[] ingredients) {
        Map<Integer, String> map = new HashMap<>();
        int start = glass.length - 2;
        int amount;
        String element;
        for (String ingredient : ingredients) {
            String[] parts = ingredient.split(" ");
            amount = Integer.parseInt(parts[1]);
            element = parts[2];
            if (element.equals("$")) {
                element = "\\$";
            } else if (element.equals("\"")) {
                element = "\"";
            }
            for (int line = start; line > start - amount; line--) {
                map.put(line, element);
            }
            start = start - amount;
        }

        for (int i = 0; i < glass.length; i++) {
            if (map.containsKey(i)) {
                glass[i] = glass[i].replaceAll(" ", map.get(i));
            }
            System.out.println(glass[i]);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] size = readArrayInt(br);
            String[] glass = new String[size[0]];
            for (int i = 0; i < size[0]; i++) {
                glass[i] = br.readLine();
            }
            int n = Integer.parseInt(br.readLine());
            String[] ingredients = new String[n];
            for (int j = 0; j < n; j++) {
                ingredients[j] = br.readLine();
            }
            makeCocktail(glass, ingredients);
        }
    }

    private static Integer[] readArrayInt(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}

package InternBackendMeetup2023.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class YandexTowerDefence {

    public static void guardians(Long[] platforms, Long[] guardians) {
        Stack<Long> plats = new Stack<>();
        plats.push(platforms[platforms.length - 1]);
        Map<Long, Integer> places = new HashMap<>();
        places.put(platforms[platforms.length - 1], 1);
        Long width;
        int count;
        for (int i = platforms.length - 2; i >= 0; i--) {
            if (platforms[i] > plats.peek()) {
                width = platforms[i] - plats.peek();
                count = places.getOrDefault(width, 0);
                places.put(width, count + 1);
                plats.push(platforms[i]);
            }
        }

        Long[] vacantPlaces = places.keySet().toArray(new Long[0]);
        Arrays.sort(vacantPlaces);
        int max = Math.min(plats.size(), guardians.length);
        int counter = 0;

        for (Long guardian : guardians) {
            for (Long widt : vacantPlaces) {
                if (guardian <= widt && places.get(widt) > 0) {
                    counter++;
                    places.put(widt, places.get(widt) - 1);
                    break;
                }
            }
            if (counter == max) {
                System.out.println(counter);
                return ;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String uselessInfo = br.readLine();
            Long[] platforms = readLongs(br);
            Long[] guardians = sorted(br);
            guardians(platforms, guardians);
        }
    }

    private static Long[] readLongs(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }

    private static Long[] sorted(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .sorted(Comparator.naturalOrder())
                .toArray(Long[]::new);
    }
}

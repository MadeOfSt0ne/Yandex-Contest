package InternBackendMeetup2023.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class YandexTowerDefence {

    public static int guardians(Long[] platforms, Long[] guardians) {
        Deque<Long> plats = new ArrayDeque<>();
        plats.offer(platforms[platforms.length - 1]);
        Map<Long, Integer> places = new HashMap<>();
        places.put(platforms[platforms.length - 1], 1);

        for (int i = platforms.length - 2; i >= 0; i--) {
            if (platforms[i] > plats.peekLast()) {
                Long width = platforms[i] - plats.peekLast();
                int count = places.getOrDefault(width, 0);
                places.put(width, count + 1);
                plats.offer(platforms[i]);
            }
        }

        int max = Math.min(plats.size(), guardians.length);
        int counter = 0;
        Arrays.sort(guardians);
        Long[] vacantPlaces = places.keySet().toArray(new Long[0]);
        Arrays.sort(vacantPlaces);

        for (Long guardian : guardians) {
            for (Long width : vacantPlaces) {
                if (guardian <= width && places.get(width) > 0) {
                    counter++;
                    places.put(width, places.get(width) - 1);
                    break;
                }
            }
            if (counter == max) {
                return counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Long[] uselessInfo = readLongs(br);
            Long[] platforms = readLongs(br);
            Long[] guardians = readLongs(br);
            System.out.println(guardians(platforms, guardians));
        }
    }

    private static Long[] readLongs(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }
}

package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A_NewStory {

    private static final long SECONDS_PER_DAY = 86400;
    private static final long SECONDS_PER_YEAR = 31536000;

    static byte countDays(long[] start, long[] end) {
        long totalStartSeconds = countTotalSeconds(start);
        long totalEndSeconds = countTotalSeconds(end);
        long diff = totalEndSeconds - totalStartSeconds;
        System.out.print(diff / SECONDS_PER_DAY + " " + diff % SECONDS_PER_DAY);
        return 0;
    }

    private static long countTotalSeconds(long[] arr) {
        long years = arr[0] * SECONDS_PER_YEAR;
        long days = (getDaysOfMonths(arr[1]) + arr[2]) * SECONDS_PER_DAY;
        long hours = arr[3] * 3600 + arr[4] * 60 + arr[5];
        return years + days + hours;
    }

    private static int getDaysOfMonths(long months) {
        Map<Long, Integer> fullMonths = new HashMap<>();
        fullMonths.put(1L, 0);
        fullMonths.put(2L, 31);
        fullMonths.put(3L, 59);
        fullMonths.put(4L, 90);
        fullMonths.put(5L, 120);
        fullMonths.put(6L, 151);
        fullMonths.put(7L, 181);
        fullMonths.put(8L, 212);
        fullMonths.put(9L, 243);
        fullMonths.put(10L, 273);
        fullMonths.put(11L, 304);
        fullMonths.put(12L, 334);
        return fullMonths.get(months);
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] start = readArray(br);
            long[] end = readArray(br);
            countDays(start, end);
        }
    }

    private static long[] readArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
    }
}

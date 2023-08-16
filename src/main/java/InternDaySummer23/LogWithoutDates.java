package InternDaySummer23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LogWithoutDates {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static int countDays(String[] time) {
        int counter = 1;
        if (time.length == 1) {
            return counter;
        }
        LocalTime a;
        LocalTime b;
        for (int i = 1; i < time.length; i++) {
            a = LocalTime.from(FORMATTER.parse(time[i - 1]));
            b = LocalTime.from(FORMATTER.parse(time[i]));
            if (a.equals(b) || b.isBefore(a)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] time = new String[n];
            for (int i = 0; i < n; i++) {
                time[i] = br.readLine();
            }
            System.out.println(countDays(time));
        }
    }
}

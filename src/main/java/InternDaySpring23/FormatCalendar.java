package InternDaySpring23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FormatCalendar {

    public static byte format(String str) {
        String[] s = str.split(" ");
        int days = Integer.parseInt(s[0]);
        String day = s[1];
        Map<String, Integer> map = new HashMap<>();
        map.put("Monday", 0);
        map.put("Tuesday", 1);
        map.put("Wednesday", 2);
        map.put("Thursday", 3);
        map.put("Friday", 4);
        map.put("Saturday", 5);
        map.put("Sunday", 6);
        int counter = 0;
        for (int i = 0; i < map.get(day); i++) {
            System.out.print(".. ");
            counter++;
        }
        for (int j = 1; j <= days; j++) {
            if (counter == 7) {
                counter = 0;
                System.out.println();
            }
            if (j < 10) {
                System.out.print("." + j + " ");
            } else {
                System.out.print(j + " ");
            }
            counter++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            format(str);
        }
    }
}

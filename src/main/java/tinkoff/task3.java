package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class task3 {

    public static byte printShelves(String[] events) {
        Map<Integer, Integer> details = new HashMap<>();
        Queue<Integer> que = new PriorityQueue<>();
        for (int i = 1; i <= events.length; i++) {
            que.add(i);
        }
        for (String ev : events) {
            String[] s = ev.split(" ");
            int detail = Integer.parseInt(s[1]);
            if (s[0].equals("+")) {
                int freeShelve = que.poll();
                System.out.println(freeShelve);
                details.put(detail, freeShelve);
            } else {
                int free = details.get(detail);
                que.add(free);
                details.remove(detail);
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int m = Integer.parseInt(br.readLine());
            String[] events = new String[m];
            for (int i = 0; i < m; i++) {
                events[i] = br.readLine();
            }
            printShelves(events);
        }
    }
}

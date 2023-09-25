package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    static Queue<Long> que = new PriorityQueue<>(Comparator.reverseOrder());
    static Map<Long, Long> works = new HashMap<>();
    static long countSadness(long money) {
        long ans = 0;
        if (money >= works.size()){
            long extra = money - works.size();
            for (int i = 0; i < extra; i++) {
                que.poll();
            }
            for (long i : que) {
                ans += i;
            }
        } else {
            return -1;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] knm = br.readLine().split(" ");
            int n = Integer.parseInt(knm[1]);
            long money = Integer.parseInt(knm[2]);
            for (int i = 0; i < n; i++) {
                String[] s = br.readLine().split(" ");
                long date = Long.parseLong(s[0]);
                long road = Long.parseLong(s[1]);
                if (works.containsKey(road)) {
                    que.add(date - works.get(road));
                }
                works.put(road, date);
            }
            System.out.println(countSadness(money));
        }
    }
}

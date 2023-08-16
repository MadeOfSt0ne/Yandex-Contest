package FallWinter22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class B_RockeTaxi {

    private static String getTotalTime(List<Order> orders) {
        StringBuilder sb = new StringBuilder();
        orders.sort(Comparator.comparing(Order::getId).thenComparing(Order::getEventTime));
        int totalMinutes;
        int startTime = 0;

        Map<Integer, Integer> time = new HashMap<>();
        for (Order order : orders) {
            if (order.getStatus().equals("A")) {
                startTime = order.getEventTime();
            }
            if (order.getStatus().equals("S") || order.getStatus().equals("C")) {
                totalMinutes = order.getEventTime() - startTime;
                if (time.containsKey(order.getId())) {
                    totalMinutes += time.get(order.getId());
                }
                time.put(order.getId(), totalMinutes);
            }
        }

        List<Integer> sorted = time.keySet().stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        for (Integer integer : sorted) {
            sb.append(time.get(integer)).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            List<Order> orders = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                List<String> arr = readList(reader);
                Order order = new Order(
                        Integer.parseInt(arr.get(0)),
                        Integer.parseInt(arr.get(1)),
                        Integer.parseInt(arr.get(2)),
                        Integer.parseInt(arr.get(3)),
                        arr.get(4)
                );
                orders.add(order);
            }
            System.out.println(getTotalTime(orders));

        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<String> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toList());
    }

    static class Order {
        private final int eventTime;
        private final int id;
        private final String status;

        public Order(int day, int hour, int minute, int id, String status) {
            eventTime = day * 24 * 60 + hour * 60 + minute;
            this.id = id;
            this.status = status;
        }

        public int getEventTime() {
            return eventTime;
        }

        public int getId() {
            return id;
        }

        public String getStatus() {
            return status;
        }
    }
}

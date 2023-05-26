package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_Water {

    private static String countWaterOrders(List<Order> orders, List<Quest> quests) {
        StringBuilder sb = new StringBuilder();
        for (Quest quest : quests) {
            int sum = 0;
            for (Order order : orders) {


                if (quest.type == 1) {
                    if (quest.startTime <= order.startTime && order.startTime <= quest.endTime) {
                        sum += order.cost;
                    }
                }

                if (quest.type == 2) {
                    if (quest.startTime <= order.endTime && order.endTime <= quest.endTime) {
                        sum += order.endTime - order.startTime;
                    }
                }
            }
            sb.append(sum);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = readInt(reader);
            List<Order> orders = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                List<Integer> arr = readList(reader);
                Order order = new Order(arr.get(0), arr.get(1), arr.get(2));
                orders.add(order);
            }

            int questsAmount = readInt(reader);
            List<Quest> quests = new ArrayList<>(questsAmount);
            for (int j = 0; j < questsAmount; j++) {
                List<Integer> array = readList(reader);
                Quest quest = new Quest(array.get(0), array.get(1), array.get(2));
                quests.add(quest);
            }

            System.out.println(countWaterOrders(orders, quests));

        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private record Order(int startTime, int endTime, int cost) {

    }

    private record Quest(int startTime, int endTime, int type) {
    }
}

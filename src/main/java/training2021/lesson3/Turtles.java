package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Turtles {
    public static int countTurtles(int totalAmount, List<Turtle> turtles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Turtle turtle : turtles) {
            if (turtle.getAfter() >= 0 && turtle.getBefore() >= 0) {
                if (totalAmount == turtle.getAfter() + turtle.getBefore() + 1) {
                    map.put(turtle.getBefore(), turtle.getAfter());
                }
            }
        }
        return map.keySet().size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int totalAmount = readInt(br);
            List<Turtle> turtles = new ArrayList<>();
            for (int i = 0; i < totalAmount; i++) {
                List<Integer> list = readList(br);
                turtles.add(new Turtle(list.get(0), list.get(1)));
            }
            int result = countTurtles(totalAmount, turtles);
            System.out.println(result);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static List<Integer> readList(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static class Turtle {
        private final int before;
        private final int after;
        public Turtle(int before, int after) {
            this.before = before;
            this.after = after;
        }

        public int getAfter() {
            return after;
        }

        public int getBefore() {
            return before;
        }
    }
}

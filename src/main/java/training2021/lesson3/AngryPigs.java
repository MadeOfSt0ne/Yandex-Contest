package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class AngryPigs {

        public static int countTurtles(int totalAmount, List<Bird> birds) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Bird bird : birds) {
                map.put(bird.getX(), 1);
            }
            return map.keySet().size();
        }

        public static void main(String[] args) throws IOException {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                int totalAmount = readInt(br);
                List<Bird> birds = new ArrayList<>();
                for (int i = 0; i < totalAmount; i++) {
                    List<Integer> list = readList(br);
                    birds.add(new Bird(list.get(0), list.get(1)));
                }
                int result = countTurtles(totalAmount, birds);
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

        private static class Bird {
            private final int x;
            private final int y;
            public Bird(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getY() {
                return y;
            }

            public int getX() {
                return x;
            }
        }
    }



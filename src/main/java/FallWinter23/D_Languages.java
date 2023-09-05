package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_Languages {

    public static byte calcBarrier(String[] langs, int[] workers) {
        Map<Integer, Worker> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> w = new LinkedList<>();
        for (int i = 0; i < workers.length; i++) {
            if (stack.empty()) {
                stack.push(workers[i]);
                map.put(0, new Worker("AB", -1, workers[i]));
                System.out.println("boss = " + map.get(0));
            } else if (stack.peek() == workers[i]) {
                System.out.println("removing duplicate: " + stack.peek());
                stack.pop();
            } else {
                int langIndex = workers[i - 1];
                map.put(workers[i], new Worker(langs[langIndex], stack.peek(), workers[i]));
                System.out.println("worker = " + map.get(workers[i]));
                stack.push(workers[i]);
                w.add(workers[i]);
            }
        }

        for (int j : w) {
            Worker curr = map.get(j);
            Worker prev = map.get(curr.boss);
            if (prev.language.equals(curr.language) || prev.language.equals("AB")) {
                System.out.print("0 ");
            } else {
                int distance = countDistance(prev, curr.language, 1, map);
                if (j == langs.length) {
                    System.out.print(distance);
                } else {
                    System.out.print(distance + " ");
                }
            }
        }
        return 0;
    }

    private static int countDistance(Worker curr, String lang, int distance, Map<Integer, Worker> map) {
        Worker boss = map.get(curr.boss);
        if (boss.language.equals(lang) || boss.language.equals("AB")) {
            return distance;
        } else {
            return countDistance(boss, lang, distance + 1, map);
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] langs = br.readLine().split(" ");
            int[] workers = readIntArray(br);
            calcBarrier(langs, workers);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    record Worker(String language, int boss, int number) {}
}

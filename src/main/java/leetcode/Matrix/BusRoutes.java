package leetcode.Matrix;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class BusRoutes {
    /**
     * Leetcode 815
     * You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats
     * forever.
     * For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 ->
     * 5 -> 7 -> 1 -> ... forever.
     * You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop
     * target. You can travel between bus stops by buses only.
     * Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.
     */
    static int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                List<Integer> curr = map.getOrDefault(routes[i][j], new LinkedList<>());
                curr.add(i);
                map.put(routes[i][j], curr);
            }
        }
        Set<Integer> buses = new HashSet<>();
        Set<Integer> stops = new HashSet<>();

        Queue<Integer> que = new LinkedList<>();
        que.offer(source);
        int moves = 0;

        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int stop = que.poll();
                if (stop == target) {
                    return moves;
                }
                for (int route : map.get(stop)) {
                    if (buses.contains(route)) {
                        continue;
                    }
                    buses.add(route);
                    for (int neighbour : routes[route]) {
                        if (stops.contains(neighbour)) {
                            continue;
                        }
                        stops.add(neighbour);
                        que.offer(neighbour);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

}

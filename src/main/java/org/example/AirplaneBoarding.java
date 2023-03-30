package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneBoarding {

    private static final String NO_PLACES = "Cannot fulfill passengers requirements";
    private static final String HAVE_PLACES = "Passengers can take seats: ";

    private static List<String> findSeats(List<char[]> places, List<Group> groups) {
        List<String> result = new ArrayList<>();
        for (Group group : groups) {
            boolean placed = false;

            for (int i = 1; i <= places.size(); i++) {
                char[] current = places.get(i - 1);
                if (group.getPosition().equals("left") && group.getSide().equals("window")) {
                    switch (group.getAmount()) {
                        case 1:
                            if (current[0] == '.') {
                                result.add(HAVE_PLACES + i + "A");
                                current[0] = 'X';
                                placed = true;
                            }
                            break;
                        case 2:
                            if (current[0] == '.' && current[1] == '.') {
                                result.add(HAVE_PLACES + i + "A " + i + "B");
                                current[0] = 'X';
                                current[1] = 'X';
                                placed = true;
                            }
                            break;
                        case 3:
                            placed = isPlaced(result, i, placed, current);
                            break;
                        default: break;
                    }
                } else if (group.getPosition().equals("left") && group.getSide().equals("aisle")) {
                    switch (group.getAmount()) {
                        case 1:
                            if (current[2] == '.') {
                                result.add(HAVE_PLACES + i + "C");
                                current[2] = 'X';
                                placed = true;
                            }
                            break;
                        case 2:
                            if (current[2] == '.' && current[1] == '.') {
                                result.add(HAVE_PLACES + i + "B " + i + "C");
                                current[2] = 'X';
                                current[1] = 'X';
                                placed = true;
                            }
                            break;
                        case 3:
                            placed = isPlaced(result, i, placed, current);
                            break;
                        default: break;
                    }
                } else if (group.getPosition().equals("right") && group.getSide().equals("aisle")) {
                    switch (group.getAmount()) {
                        case 1:
                            if (current[4] == '.') {
                                result.add(HAVE_PLACES + i + "D");
                                current[4] = 'X';
                                placed = true;
                            }
                            break;
                        case 2:
                            if (current[4] == '.' && current[5] == '.') {
                                result.add(HAVE_PLACES + i + "D " + i + "E");
                                current[5] = 'X';
                                current[4] = 'X';
                                placed = true;
                            }
                            break;
                        case 3:
                            placed = isPlaced2(result, i, placed, current);
                            break;
                        default: break;
                    }
                } else if (group.getPosition().equals("right") && group.getSide().equals("window")) {
                    switch (group.getAmount()) {
                        case 1:
                            if (current[6] == '.') {
                                result.add(HAVE_PLACES + i + "F");
                                current[6] = 'X';
                                placed = true;
                            }
                            break;
                        case 2:
                            if (current[5] == '.' && current[6] == '.') {
                                result.add(HAVE_PLACES + i + "E " + i + "F");
                                current[5] = 'X';
                                current[6] = 'X';
                                placed = true;
                            }
                            break;
                        case 3:
                            placed = isPlaced2(result, i, placed, current);
                            break;
                        default: break;
                    }
                }
                if (placed) {
                    result.add(Arrays.toString(current));
                    break;
                }
            }
            if (!placed) {
                result.add(NO_PLACES);
            }
        }
        return result;
    }

    private static boolean isPlaced2(List<String> result, int i, boolean placed, char[] current) {
        if (current[4] == '.' && current[5] == '.' && current[6] == '.') {
            result.add(HAVE_PLACES + i + "D " + i + "E " + i + "F");
            current[4] = 'X';
            current[5] = 'X';
            current[6] = 'X';
            placed = true;
        }
        return placed;
    }

    private static boolean isPlaced(List<String> result, int i, boolean placed, char[] current) {
        if (current[0] == '.' && current[1] == '.' && current[2] == '.') {
            result.add(HAVE_PLACES + i + "A " + i + "B " + i + "C");
            current[0] = 'X';
            current[1] = 'X';
            current[2] = 'X';
            placed = true;
        }
        return placed;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<char[]> places = new ArrayList<>();
            List<Group> groups = new ArrayList<>();
            int numberOfRows = readInt(reader);
            for (int i = 0; i < numberOfRows; i++) {
                char[] seats = reader.readLine().toCharArray();
                places.add(seats);
            }
            int numberOfGroups = readInt(reader);
            for (int j = 0; j < numberOfGroups; j++) {
                String[] groupString = reader.readLine().split(" ");
                groups.add(new Group(Integer.parseInt(groupString[0]), groupString[1], groupString[2]));
            }
            List<String> result = findSeats(places, groups);
            System.out.println(result);
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());
    }

    public static class Group {
        final int amount;
        final String side;
        final String position;

        public Group(int amount, String side, String position) {
            this.amount = amount;
            this.side = side;
            this.position = position;
        }

        public int getAmount() {
            return amount;
        }

        public String getSide() {
            return side;
        }

        public String getPosition() {
            return position;
        }
    }
}

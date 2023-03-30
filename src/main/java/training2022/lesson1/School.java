package training2022.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class School {

    public static long findPlace(Long[] street) {
        if (street.length <= 2) {
            return street[0];
        }
        long left = street[0];
        long right = street[street.length - 1];
        long position = street[0];
        long tmpDist = findDistance(street, position);
        while (left <= right) {
            long mid = left + (right - left) / 2;
            System.out.println("Left = " + left + " Mid = " + mid + " Right = " + right);
            long fromLeft = findDistance(street, left);
            long fromRight = findDistance(street, right);
            long fromMid = findDistance(street, mid);
            System.out.println("From left = " + fromLeft + " from mid = " + fromMid + " from right = " + fromRight);
            if (distanceBetweenTwo(fromLeft, fromMid) == distanceBetweenTwo(fromRight, fromMid)) {
                if (fromLeft > fromRight) {
                    return right;
                } else if (fromRight > fromLeft) {
                    return left;
                } else {
                    return mid;
                }
            } else if (distanceBetweenTwo(fromLeft, fromMid) < distanceBetweenTwo(fromRight, fromMid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (fromMid < tmpDist) {
                tmpDist = fromMid;
                position = mid;
            }
            System.out.println("Best position = " + position + " with distance = " + tmpDist);
        }
        return position;
    }

    private static long minOfThree(Long a, Long b, Long c) {
        Long[] arr = new Long[]{a, b, c};
        Arrays.sort(arr);
        return arr[0];
    }

    public static long findIteratively(Long[] street) {
        long minDist = findDistance(street, street[0]);
        long minPos = street[0];
        for (long i = street[0]; i <= street[street.length - 1]; i++) {
            long distance = 0;
            for (Long lo : street) {
                distance = distance + distanceBetweenTwo(i, lo);
            }
            System.out.println("Distance from " + i + " = " + distance);
            if (distance < minDist) {
                minDist = distance;
                minPos = i;
            }
        }
        return minPos;
    }

    private static long distanceBetweenTwo(long a, long b) {
        if (a >= b) {
            return a - b;
        }
        return b - a;
    }

    private static long findDistance(Long[] street, long point) {
        long sum = 0;
        for (Long lo : street) {
            if (lo >= point) {
                sum = sum + lo - point;
            } else {
                sum = sum + point - lo;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = readInt(br);
            Long[] array = readIntArray(br);
            System.out.println(findPlace(array));
        }
    }

    private static Long[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
}

package leetcode.Matrix;

import java.util.HashSet;
import java.util.Set;

public class LineReflection {
    /**
     * Leetcode 356
     * Given n points on a 2D plane, find if there is such a line parallel to y-axis that reflect the given points
     * symmetrically.
     * In other words, answer whether or not if there exists a line that after reflecting all points over the given line,
     * the original points' set is the same as the reflected ones.
     */
    public boolean isReflected(int[][] points) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        Set<Point> pointSet = new HashSet<>();
        for (int[] point : points) {
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            pointSet.add(new Point(point[0], point[1]));
        }
        int sum = minX + maxX;
        for (int[] point : points) {
            if (!pointSet.contains(new Point(sum - point[0], point[1]))) {
                return false;
            }
        }
        return true;
    }
    record Point (int x, int y) {}
}

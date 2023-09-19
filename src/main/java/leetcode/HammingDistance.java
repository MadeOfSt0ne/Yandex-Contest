package leetcode;

public class HammingDistance {
    /**
     * Leetcode 461
     * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
     * Given two integers x and y, return the Hamming distance between them.
     */
    public int hammingDistance(int x, int y) {
        int hd = 0;
        while (x > 0 || y > 0){
            if (x % 2 != y % 2) {
                hd++;
            }
            x /= 2;
            y /= 2;
        }
        return hd;
    }
}

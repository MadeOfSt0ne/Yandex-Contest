package leetcode;

import java.util.Arrays;

public class CountPrimes {
    /**
     * Leetcode 204
     * Given an integer n, return the number of prime numbers that are strictly less than n.
     */
    static int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= n; i++){
            for (int j = 2 * i; j <= n; j += i){
                primes[j] = false;
            }
        }
        //System.out.println("primes = " + Arrays.toString(primes));

        int count = 0;
        for (int i = 0; i < n; i++){
            if (primes[i]){
                count++;
            }
        }

        return count;
    }
}

package leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ShuffleAnArray {
    /**
     * Leetcode 384
     * Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array
     * should be equally likely as a result of the shuffling.
     * Implement the Solution class:
     * Solution(int[] nums) Initializes the object with the integer array nums.
     * int[] reset() Resets the array to its original configuration and returns it.
     * int[] shuffle() Returns a random shuffling of the array.
     */
    private int[] array;
    public ShuffleAnArray(int[] nums) {
        array = nums;
    }

    public int[] reset() {
        return array;
    }

    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        int[] shuffled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int rndIdx = (int) (Math.random() * list.size());
            shuffled[i] = list.get(rndIdx);
            list.remove(rndIdx);
        }
        return shuffled;
    }
}

package leetcode.Design;

import java.util.*;

public class InsertDeleteGetRandom {
    /**
    * Leetcode 380
    * Implement the RandomizedSet class:
    * 1. RandomizedSet() Initializes the RandomizedSet object.
    * 2. bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present,
    * false otherwise.
    * 3. bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false
    * otherwise.
    * 4. int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one
    * element exists when this method is called). Each element must have the same probability of being returned.
    * <p>
    * You must implement the functions of the class such that each function works in average O(1) time complexity.
    */
    class RandomizedSet {
        private Map<Integer, Integer> map;
        private Random random;
        private List<Integer> elements;

        public RandomizedSet() {
            map = new HashMap<>();
            random = new Random();
            elements = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                elements.add(val);
                map.put(val, elements.size() - 1);
                return true;
            }
            return false;
        }

        public boolean remove(int val) {
            int lastIndex = map.getOrDefault(val, -1);
            if (lastIndex == -1) {
                return false;
            }
            Collections.swap(elements, lastIndex, elements.size() - 1);
            int otherSwappedValue = elements.get(lastIndex);
            map.put(otherSwappedValue, lastIndex);
            elements.remove(elements.size() - 1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(elements.size());
            return elements.get(randomIndex);
        }
    }
}

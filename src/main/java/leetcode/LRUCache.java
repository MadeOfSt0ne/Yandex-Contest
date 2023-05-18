package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    /**
     * Leetcode 146
     * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
     * Implement the LRUCache class:
     * 1. LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
     * 2. int get(int key) Return the value of the key if the key exists, otherwise return -1.
     * 3. void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair
     * to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
     * The functions get and put must each run in O(1) average time complexity.
     */
    private static class LinkedNode {
        int key;
        int value;
        LinkedNode prev;
        LinkedNode next;
    }

    private final Map<Integer, LinkedNode> cache;
    private final LinkedNode head;
    private final LinkedNode tail;
    private final int capacity;
    private int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);

        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LinkedNode element = cache.get(key);
        if (element == null) {
            return -1;
        }
        remove(element);
        moveToHead(element);

        return element.value;
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);
        if (node != null) {
            node.value = value;
            remove(node);
            moveToHead(node);
        } else {
            node = new LinkedNode();
            node.value = value;
            node.key = key;
            cache.put(key, node);
            moveToHead(node);
            size++;

            if (size > capacity) {
                cache.remove(tail.prev.key);
                remove(tail.prev);
                size--;
            }
        }
    }

    private void remove(LinkedNode node) {
        LinkedNode previous = node.prev;
        previous.next = node.next;
        LinkedNode nextNode = node.next;
        nextNode.prev = node.prev;
    }

    private void moveToHead(LinkedNode node) {
        LinkedNode temp = head.next;
        head.next = node;

        node.prev = head;
        node.next = temp;

        temp.prev = node;
    }
}

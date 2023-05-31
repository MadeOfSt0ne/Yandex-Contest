package leetcode;

public class DeleteNodeInALinkedList {
    /**
     * Leetcode 237
     * There is a singly-linked list head and we want to delete a node in it.
     * You are given the node to be deleted node. You will not be given access to the first node of head.
     * All the values of the linked list are unique, and it is guaranteed that the given node is not the last node in
     * the linked list.
     * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
     * 1. The value of the given node should not exist in the linked list.
     * 2. The number of nodes in the linked list should decrease by one.
     * 3. All the values before node should be in the same order.
     * 4. All the values after node should be in the same order.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}

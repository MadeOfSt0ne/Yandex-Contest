package leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    /**
     * Leetcode 94
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     */
    List<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new LinkedList<>();
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public static class TreeNode {
       int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

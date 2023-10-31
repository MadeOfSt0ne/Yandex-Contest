package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    /**
    * Leetcode 144
    * Given the 'root' of a binary tree, return the preorder traversal of its nodes' values
    */
    ArrayList<Integer> ans;
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        preorder(root);
        return ans;
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


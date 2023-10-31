package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    /**
     * Leetcode 145
     * Given the 'root' of a binary tree, return the postorder traversal of its nodes' values
     */
    List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        postorder(root);
        return ans;
    }

    private void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


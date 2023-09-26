package leetcode.Tree;

public class BalancedBinaryTree {
    /**
     * Leetcode 110
     * Given a binary tree, determine if it is height-balanced
     */
    public class TreeNode {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        if (leftH == -1 || rightH == -1) {
            return -1;
        }
        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        return Math.max(leftH, rightH) + 1;
    }

}

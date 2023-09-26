package leetcode.Tree;

public class MinimumDepthOfBinaryTree {
    /**
     * Leetcode 111
     * Given a binary tree, find its minimum depth.
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     * Note: A leaf is a node with no children.
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

        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int le = minDepth(root.left);
            int ri = minDepth(root.right);
            if (le == 0 || ri == 0) {
                return Math.max(le, ri) + 1;
            }
            return Math.min(le, ri) + 1;
        }
    }


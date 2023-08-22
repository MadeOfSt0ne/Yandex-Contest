package leetcode.Tree;

public class ConvertSortedArrayToBST {
    /**
     * Leetcode 108
     * Given an integer array where the elements are sorted in ascending order, convert it to a
     * height-balanced binary search tree.
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, l, mid - 1);
        root.right = createBST(nums, mid + 1, r);
        return root;
    }

    class TreeNode {
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

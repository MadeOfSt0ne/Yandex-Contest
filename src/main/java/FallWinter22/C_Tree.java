package FallWinter22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_Tree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        public TreeNode() {}
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    private static TreeNode createTree(int[] nums, int i) {
        TreeNode root = null;
        if (i < nums.length) {
            root = new TreeNode(nums[i]);
            root.left = createTree(nums, i * 2 + 1);
            root.right = createTree(nums, i * 2);
        }
        return root;
    }

    public static byte processTree(int[] nq, int[] v) {
        int[] nums = new int[nq[0]];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        TreeNode tree = createTree(nums, nums.length);
        inOrder(tree);
        return 0;
    }

    private static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nq = readIntArray(br);
            int[] v = readIntArray(br);
            processTree(nq, v);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

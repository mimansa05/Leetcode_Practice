import java.util.ArrayList;
import java.util.List;

public class Main {

    // Binary Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class LC_144_BinaryTreePreorderTraversal {

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root, result);
            return result;
        }

        private void preorder(TreeNode root, List<Integer> result) {
            if (root == null)
                return;

            result.add(root.val);      // Root
            preorder(root.left, result);   // Left
            preorder(root.right, result);  // Right
        }
    }

    public static void main(String[] args) {

        // Creating the tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        List<Integer> ans = sol.preorderTraversal(root);

        System.out.println(ans);
    }
}
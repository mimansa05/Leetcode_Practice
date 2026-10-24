/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        //Mirror image of each other
        //means left of left side=right of right side
        return Helper(root.left,root.right);
    }
    boolean Helper(TreeNode left,TreeNode right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }
        if(left.val!=right.val) return false;
        return Helper(left.left,right.right) && Helper(left.right,right.left);
    }
}
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
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root)!=-1;
    }
    int checkBalanced(TreeNode root)
    {
        if(root==null) return 0;
        int leftdepth=checkBalanced(root.left);
        if(leftdepth==-1) return -1;
        int rightdepth=checkBalanced(root.right);
        if(rightdepth==-1) return -1;
        if(Math.abs(leftdepth-rightdepth)>1) return -1;
        return 1+Math.max(leftdepth,rightdepth);
    }
}
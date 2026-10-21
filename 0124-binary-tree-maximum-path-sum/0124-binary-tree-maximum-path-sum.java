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
    int maxi=-9999;
    //int sum=0;
    public int maxPathSum(TreeNode root) {
        Sum(root);
        return maxi;
    }
    int Sum(TreeNode node)
    {
        if(node==null) return 0;
        int lh=Math.max(0,Sum(node.left));
        int rh=Math.max(0,Sum(node.right));
        maxi=Math.max(maxi,node.val+lh+rh);
        return node.val+Math.max(lh,rh);
    }
}
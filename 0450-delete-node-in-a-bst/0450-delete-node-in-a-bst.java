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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key)
        {
            //0 child
            if(root.left==null && root.right==null)
            {
                //delete(root);
                return null;
            }
            //1 child
            if(root.left!=null && root.right==null)
            {
                //TreeNode temp=root.left;
                //delete(root);
                return root.left;
            }
            if(root.left==null && root.right!=null)
            {
                //TreeNode temp=root.right;
                //delete(root);
                return root.right;
            }
            //2 child
            if(root.left!=null && root.right!=null)
            {
                int mini=minVal(root.right);
                root.val=mini;
                root.right=deleteNode(root.right,mini);
                return root;
            }

        }
        else if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
           // return;
        }
        else
        {
            root.right=deleteNode(root.right,key);
            //return;
        }
        return root;
    }
    int minVal(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root.val;
    }
}
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return split(preorder,0,map,0,inorder.length-1);
    }
    TreeNode split(int[] preorder,int index, HashMap<Integer,Integer> map,int left,int right)
    {
        TreeNode root=new TreeNode(preorder[index]);
        int mid=map.get(preorder[index]);
        if(left<mid)
        {
            root.left=split(preorder,index+1,map,left,mid-1);
        }
        if(mid<right)
        {
            root.right=split(preorder,index+mid-left+1,map,mid+1,right);
        }
        return root;
    }
}
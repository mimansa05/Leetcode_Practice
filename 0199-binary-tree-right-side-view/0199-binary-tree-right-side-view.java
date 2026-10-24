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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        //right- last node of every level
        //left- first node of every level
        //Recursive solution
        //Reverse preorder for right--> root right left
        Traverse(root,0);
        return ans;
    }
    void Traverse(TreeNode node,int level)
    {
        if(node==null) return;
        if(level==ans.size())
        {
            ans.add(node.val);
        }
        Traverse(node.right,level+1);
        Traverse(node.left,level+1);
    }
}
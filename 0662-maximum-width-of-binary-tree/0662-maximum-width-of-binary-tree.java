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
 class Tuple
 {
    TreeNode node;
    int num;
    int level;
    Tuple(TreeNode node,int num,int level)
    {
        this.node=node;
        this.num=num;
        this.level=level;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        //max nodes between any two nodes
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,1,0));
        int pn=1;
        int pl=0;
        int res=0;
        while(!q.isEmpty())
        {
            Tuple t=q.poll();
            TreeNode n=t.node;
            int a=t.num;
            int l=t.level;
            if(l>pl)
            {
                pl=l;
                pn=a;
            }
            res=Math.max(res,a-pn+1);
            if(n.left!=null)
            {
                q.offer(new Tuple(n.left,2*a,l+1));
            }
             if(n.right!=null)
            {
                q.offer(new Tuple(n.right,2*a+1,l+1));
            }
        }
        return res;
    }
}
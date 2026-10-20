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
    public int maxDepth(TreeNode root) {
        int count=0;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.offer(root);
        count++;
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
               TreeNode node=q.poll();
               sub.add(node.val);
               if(node.left!=null)
               {
                  q.offer(node.left);
               }
               if(node.right!=null)
               {
                  q.offer(node.right);
               }
            }
            res.add(sub);
        }
        return res.size();
    }
}
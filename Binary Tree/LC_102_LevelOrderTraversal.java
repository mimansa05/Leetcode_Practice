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
class LC_102_LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> w= new LinkedList<List<Integer>>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return w;
        q.offer(root);
        while(!q.isEmpty())
        {
            int l=q.size();
            List<Integer> sub=new LinkedList<>();
            for(int i=0;i<l;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }
                sub.add(q.poll().val);
            }
            w.add(sub);
        }
        return w;
    }
}
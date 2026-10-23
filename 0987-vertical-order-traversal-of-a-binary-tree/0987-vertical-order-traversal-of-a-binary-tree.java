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
    TreeNode root;
    int row;
    int col;
    Tuple(TreeNode root,int row,int col){
        this.root=root;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple cur=q.poll();
            TreeNode t=cur.root;
            int r=cur.row;
            int c=cur.col;
            map.putIfAbsent(r,new TreeMap<>()); //if level(horizontal) value is not present
            map.get(r).putIfAbsent(c,new PriorityQueue<>()); //if vertical not there add vertical with new pq
            map.get(r).get(c).offer(t.val);
            if(t.left!=null)
            {
                q.offer(new Tuple(t.left,r-1,c+1));
            }
            if(t.right!=null)
            {
                q.offer(new Tuple(t.right,r+1,c+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values())
        {
            List<Integer> temp=new ArrayList<>();
            for(PriorityQueue<Integer> pq:ys.values())
            {
                while(!pq.isEmpty())
                {
                    temp.add(pq.poll());
                }
            }
            res.add(temp);
        }
        return res;
    }
}
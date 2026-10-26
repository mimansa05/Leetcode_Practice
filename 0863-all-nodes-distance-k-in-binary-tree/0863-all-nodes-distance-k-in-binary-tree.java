/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        /** 1.Mark parent pointer
        2. move upwards,left,right till distance of k */
        //step1: store parent of every node
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode n=q.poll();
            if(n.left!=null)
            {
                map.put(n.left,n);
                q.add(n.left);
            }
             if(n.right!=null)
            {
                map.put(n.right,n);
                q.add(n.right);
            }
        }
        //step 2:bfs upto target and k
        HashSet<TreeNode> vis=new HashSet<>();
        q.offer(target);
        vis.add(target);
        int d=0;
        while(!q.isEmpty() && d<k)
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                //move in all 3 directions, right,left & parent
                TreeNode n=q.poll();
                if(n.left!=null && vis.add(n.left))
                {
                    q.offer(n.left);
                }
                 if(n.right!=null && vis.add(n.right))
                {
                    q.offer(n.right);
                }
                TreeNode p=map.get(n);
                if(p!=null && vis.add(p))
                {
                    q.offer(p);
                }
            }
            d++;
        }
        //step 3: print all the remaining elements of queue into ans
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }
        return ans;
    }
}
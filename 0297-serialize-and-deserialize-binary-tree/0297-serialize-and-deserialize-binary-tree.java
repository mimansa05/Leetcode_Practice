/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //USED PREORDER
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder sb=new StringBuilder(); 
       build(root,sb);
       return sb.toString();
    }
    void build(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        build(root.left,sb);
        build(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>();
        for(String s: data.split(","))
        {
            q.add(s);
        }
        return buildTree(q);
    }
    TreeNode buildTree(Queue<String> q)
    {
        String s=q.poll();
        if(s.equals("N")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(s));
        root.left=buildTree(q);
        root.right=buildTree(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
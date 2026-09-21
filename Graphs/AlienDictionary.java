import java.util.*;
class AlienDictionary {
    public String findOrder(String[] words) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            adj.add(new ArrayList<>());
        }
        boolean present[]=new boolean[26];
        for(String word:words)
        {
            for(char ch:word.toCharArray())
            {
                present[ch-'a']=true;
            }
        }
        
        //build graph for comparing adjacent nodes
        for(int i=0;i<words.length-1;i++)
        {
            String s1=words[i];
            String s2=words[i+1];
            int len=Math.min(s1.length(),s2.length());
            boolean found=false;
            for(int j=0;j<len;j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    int u=s1.charAt(j)-'a';
                    int v=s2.charAt(j)-'a';
                    adj.get(u).add(v);
                    found=true;
                    break;
                }
            }
            if(!found && s1.length()>s2.length()) return "";
        }
        int vis[]=new int[26];
        int dfsvis[]=new int[26];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(present[i] && vis[i]==0)
            {
                if(dfs(i,adj,vis,dfsvis,ans))
                {
                    return "";
                }
            }
        }
        return ans.reverse().toString();
    }
    public boolean dfs(int node,List<List<Integer>> adj,int vis[],int dfsvis[],StringBuilder ans)
    {
        vis[node]=1;
        dfsvis[node]=1;
        for(int x:adj.get(node))
        {
            if(vis[x]==0)
            {
                if(dfs(x,adj,vis,dfsvis,ans)) return true;
            }
            else if(dfsvis[x]==1) return true;
        }
        dfsvis[node]=0;
        ans.append((char)(node+'a'));
        return false;
    }
}
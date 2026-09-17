class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int m=graph[0].length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
                if(color[i]==-1)
                if(dfs(i,0,graph,color)==false) return false;
        }
        return true;
    }
    boolean dfs(int node,int col,int[][] graph,int[] color)
    {
        color[node]=col;
        for(int x:graph[node])
        {
                if(color[x]==-1)
                {
                   if (dfs(x,1-col,graph,color)==false) return false;
                }
                if(color[x]==col) return false;
        }
        return true;

    }
}
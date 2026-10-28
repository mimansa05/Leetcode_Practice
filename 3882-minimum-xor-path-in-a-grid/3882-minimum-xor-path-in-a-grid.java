class Solution {
    int ans=Integer.MAX_VALUE;
    int n,m;
    public int minCost(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][][] visited=new boolean[n][m][1024];
        dfs(0,0,grid[0][0],grid,visited);
        return ans;
    }
    void dfs(int i,int j,int xor,int [][]grid,boolean[][][] visited)
    {
        if(i>=n||j>=m) return;
        if(visited[i][j][xor]) return;
        visited[i][j][xor]=true;
        if(i==n-1 && j==m-1)
        {
            ans=Math.min(ans,xor);
            return;
        }
        if(j+1<m)
        {
            dfs(i,j+1,xor ^ grid[i][j+1],grid,visited);
        }
        if(i+1<n)
        {
            dfs(i+1,j,xor ^ grid[i+1][j],grid,visited);
        }
    }
}
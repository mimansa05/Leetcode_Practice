class LC_1020_NumberOfEnclaves {
    void dfs(int row,int col,int[] drow,int[] dcol,int[][] grid,int[][] vis,int n,int m)
    {
        vis[row][col]=1;
        for(int i=0;i<4;i++)
        {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
            {
                dfs(nrow,ncol,drow,dcol,grid,vis,n,m);
            }
        }

    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;//row
        int m=grid[0].length;//col
        int vis[][]=new int[n][m];
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int count=0;
        for(int j=0;j<m;j++)
        {
            //first row
            if(grid[0][j]==1 && vis[0][j]==0)
            {
                dfs(0,j,drow,dcol,grid,vis,n,m);
            }
            //last row
            if(grid[n-1][j]==1 && vis[n-1][j]==0)
            {
                dfs(n-1,j,drow,dcol,grid,vis,n,m);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==1 && vis[i][0]==0)
            {
                dfs(i,0,drow,dcol,grid,vis,n,m);
            }
            if(grid[i][m-1]==1 && vis[i][m-1]==0)
            {
                dfs(i,m-1,drow,dcol,grid,vis,n,m);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
}
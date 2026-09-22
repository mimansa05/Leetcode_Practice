class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                {
                    return dfs(i,j,row,col,vis,grid,n,m);
                }
            }
        }
        return 0;
    }
    int dfs(int i,int j,int row[],int col[],int vis[][],int grid[][],int n,int m)
    {
        vis[i][j]=1;
        int p=0;
        for(int k=0;k<4;k++)
        {
            int nrow=i+row[k];
            int ncol=j+col[k];
            if(nrow<0 || nrow>=n || ncol<0 || ncol>=m)
            {
                p++;
            }
            else if(grid[nrow][ncol]==0)
            {
                p++;
            }
            else if(vis[nrow][ncol]==0)
            {
                p+=dfs(nrow,ncol,row,col,vis,grid,n,m);
            }
        }
        return p;
    }
}
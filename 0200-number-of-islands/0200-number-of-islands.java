class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        HashSet<List<String>> set=new HashSet<>();
        boolean vis[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==false)
                {
                    //List<String> shape=new ArrayList<>();
                    dfs(i,j,grid,vis,drow,dcol);
                    count++;
                    
                }
            }
        }
        return count;
    }
    void dfs(int row,int col,char[][]grid,boolean vis[][],int drow[],int dcol[])
    {
        int n=grid.length;
        int m=grid[0].length;
        vis[row][col]=true;
        for(int i=0;i<4;i++)
        {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && !vis[nrow][ncol])
            {
                dfs(nrow,ncol,grid,vis,drow,dcol);

            }
        }

    }
}
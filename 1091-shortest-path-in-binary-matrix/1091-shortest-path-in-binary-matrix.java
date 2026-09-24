class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int dc[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        if(n==1) return 1;
        Queue<int[]> q=new LinkedList<>();
        int vis[][]=new int[n][n];
        vis[0][0]=1;
        q.add(new int[]{0,0,1});
        while(!q.isEmpty())
        {
            int a[]=q.poll();
            int row=a[0];
            int col=a[1];
            int cnt=a[2];
            if(row==n-1 && col==n-1) return cnt;
            for(int[] d:dc)
            {
                int nrow=row+d[0];
                int ncol=col+d[1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && grid[nrow][ncol]==0 && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new int[]{nrow,ncol,cnt+1});
                }
            }
        }
        return -1;
    }
}
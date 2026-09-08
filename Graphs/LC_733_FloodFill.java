class LC_733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int i=sr;
        int j=sc;
        int original=image[i][j];
        if(original==color)
        {
            return image;
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int vis[][]=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(i=0;i<n;i++)
        {
            for( j=0;j<m;j++)
            {
                if(image[i][j]==color)
                {
                    q.add(new int[]{i,j});
                    vis[i][j]=color;
                }
                else vis[i][j]=0;
            }
        }
        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            for( i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                && image[nrow][ncol]==original)
                {
                    image[nrow][ncol]=color;
                    q.add(new int[]{nrow,ncol});
                    vis[nrow][ncol]=color;
                }
            }
        }
        return image;
    }
}
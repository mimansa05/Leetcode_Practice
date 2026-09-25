class Tuple
{
    int distance;
    int row;
    int col;
    Tuple(int distance,int row,int col)
    {
        this.distance=distance;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        //dijsktras algo
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        PriorityQueue<Tuple> pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        pq.add(new Tuple(0,0,0));
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!pq.isEmpty())
        {
            Tuple cur=pq.poll();
            int diff=cur.distance;
            int row=cur.row;
            int col=cur.col;
            if(row==n-1 && col==m-1) return diff;
            for(int i=0;i<4;i++)
            {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m)
                {
                    int neweffort=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
                    if(neweffort<dist[nrow][ncol])
                    {
                        dist[nrow][ncol]=neweffort;
                        pq.add(new Tuple(neweffort,nrow,ncol));
                    }
                }
            }
        }
        return 0;
    }
}
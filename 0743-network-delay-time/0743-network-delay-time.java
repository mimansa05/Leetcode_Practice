class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dist[i],6000);
            dist[i][i]=0;
        }
        for(int time[]:times)
        {
            int u=time[0]-1;
            int v=time[1]-1;
            int wt=time[2];
            dist[u][v]=wt;
        }
        for(int v=0;v<n;v++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    dist[i][j]=Math.min(dist[i][j],dist[i][v]+dist[v][j]);
                }
            }
        }
        int maxi=Integer.MIN_VALUE;
        k--;
        for(int i=0;i<n;i++)
        {
            if(dist[k][i]!=6000)
            {
                maxi=Math.max(maxi,dist[k][i]);
            }
            else return -1;
        }
        return maxi;
    }
}
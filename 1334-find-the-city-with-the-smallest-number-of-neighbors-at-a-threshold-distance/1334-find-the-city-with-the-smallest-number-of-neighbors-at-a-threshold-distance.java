class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        //FLOYDS ALGO
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dist[i],10000000);
            dist[i][i]=0;
        }
        int mini=Integer.MAX_VALUE;
        int ans=-1;
        for(int edge[]:edges)
        {
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && dist[i][j]<=distanceThreshold) count++;
            }
            if(count<=mini)
            {
                mini=count;
                ans=i;
            }
        }
        return ans;
    }
}
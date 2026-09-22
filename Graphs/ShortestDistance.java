import java.util.*;
class ShortestDistance {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{src,0});
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
                int u=edges[i][0];
                int v=edges[i][1];
                adj.get(u).add(v);
                adj.get(v).add(u);
        }
        int dist[]=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        while(!q.isEmpty())
        {
            int a[]=q.poll();
            int node=a[0];
            for(int it:adj.get(node))
            {
                if(dist[node]+1<dist[it])
                {
                    dist[it]=dist[node]+1;
                    q.add(new int[]{it,dist[node]+1});
                }
            }
        }
        for(int i=0;i<V;i++)
        {
            if(dist[i]==1e9)
            {
                dist[i]=-1;
            }
        }
        return dist[dest];
    }
}
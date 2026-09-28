class Pair
{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Tuple
{
    int first;
    int second;
    int third;
    Tuple(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        int m=flights.length;
        for(int i=0;i<m;i++)
        {
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        int dist[]=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        while(!q.isEmpty())
        {
            Tuple cur=q.poll();
            int stops=cur.first;
            int node=cur.second;
            int cost=cur.third;
            if(stops>k) continue;
            for(Pair it:adj.get(node))
            {
                int adjnode=it.first;
                int wt=it.second;
                if(cost+wt<dist[adjnode] && stops<=k)
                {
                    dist[adjnode]=cost+wt;
                    q.add(new Tuple(stops+1,adjnode,cost+wt));
                }
            }

        }
        if(dist[dst]==(int)1e9) return -1;
        return dist[dst];
    }
}
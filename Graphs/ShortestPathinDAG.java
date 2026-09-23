class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class ShortestPathinDAG {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            ArrayList<Pair> temp=new ArrayList<Pair>();
            adj.add(temp);
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        //Step 1:Topo sort
        int vis[]=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                Toposort(i,vis,adj,st);
            }
        }
        
        //Step 2:Do the distance thing
        int dist[]=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[0]=0;
        while(!st.isEmpty())
        {
            int node=st.peek();
            st.pop();
            for(int i=0;i<adj.get(node).size();i++)
            {
                int v=adj.get(node).get(i).first;
                int wt=adj.get(node).get(i).second;
                if(dist[node]+wt<dist[v])
                {
                    dist[v]=dist[node]+wt;
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
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<V;i++)
        {
            if(dist[i]==(int)1e9)
            {
                ans.add(-1);
            }
            else
            {
                ans.add(dist[i]);
            }
        }

        return ans;
    }
    void Toposort(int node,int[] vis,ArrayList<ArrayList<Pair>> adj,Stack<Integer>st)
    {
        vis[node]=1;
        for(Pair it:adj.get(node))
        {
            int v=it.first;
            if(vis[v]==0)
            {
                Toposort(v,vis,adj,st);
            }
        }
        st.push(node);
    }
}
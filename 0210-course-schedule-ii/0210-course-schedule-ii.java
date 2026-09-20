class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<List<Integer>> adj=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            adj.get(b).add(a);
        }
        int vis[]=new int[numCourses];
        int dfsvis[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(vis[i]==0)
            {
                if(hasCycle(i,vis,dfsvis,adj,st)==true) return new int[0];
            }
        }
        int ans[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
    public boolean hasCycle(int node,int vis[],int dfsvis[],List<List<Integer>> adj,Stack<Integer> st)
    {
        vis[node]=1;
        dfsvis[node]=1;
        for(int x:adj.get(node))
        {
            if(vis[x]==0)
            {
                if(hasCycle(x,vis,dfsvis,adj,st)==true) return true;
            }
            else if(dfsvis[x]==1) return true;
        }
        dfsvis[node]=0;
        st.push(node);
        return false;
    }
}
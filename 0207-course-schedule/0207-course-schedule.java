class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         //Detect a cycle ina graph
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];

            adj.get(prerequisite).add(course);
        }

        int vis[] = new int[numCourses];
        int dfsvis[] = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(vis[i] == 0) {

                if(checkCycle(i, adj, vis, dfsvis) == true)
                    return false;
            }
        }

        return true;
    }

    boolean checkCycle(int node, List<List<Integer>> adj,
                       int vis[], int dfsvis[]) {

        vis[node] = 1;
        dfsvis[node] = 1;

        for(int neighbour : adj.get(node)) {

            if(vis[neighbour] == 0) {

                if(checkCycle(neighbour, adj, vis, dfsvis) == true)
                    return true;
            }

            else if(dfsvis[neighbour] == 1) {
                return true;
            }
        }

        dfsvis[node] = 0;

        return false;
    }
}
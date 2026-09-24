class Solution {
    public int minCost(int n, int[] cuts) {
        HashMap<String,Integer> dp=new HashMap<>();
        return dfs(0,n,cuts,dp);
    }
    int dfs(int l,int r,int[] cuts,HashMap<String,Integer> dp)
    {
        if(r-l==1) return 0;
        String key=l+","+r;
        if(dp.containsKey(key)) return dp.get(key);
        int res=Integer.MAX_VALUE;
        for(int c:cuts)
        {
            if(l<c && c<r)
            {
                int cost=(r-l)+dfs(l,c,cuts,dp)+dfs(c,r,cuts,dp);
                res=Math.min(res,cost);
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        dp.put(key,res);
        return res;
    }
}
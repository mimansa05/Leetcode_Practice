class Solution {
    public int integerReplacement(int n) {
        HashMap<Long,Integer> dp=new HashMap<>();
        return solve(n,dp);
    }
    int solve(long n, HashMap<Long,Integer> dp)
    {
        if(n==1) return 0;
        if(dp.containsKey(n)) 
        {
            return dp.get(n);
        }
        int ans;
        if(n%2==0) 
        {
            ans= 1+solve(n/2,dp);
        }
         else ans=1+Math.min(solve(n-1,dp),solve(n+1,dp));
        dp.put(n,ans);
        return ans;
    }
}
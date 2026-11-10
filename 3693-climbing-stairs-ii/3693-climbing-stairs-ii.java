class Solution {
    
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n+1];
        //Arrays.fill(dp,-1);
        //return solve(0,n,costs,dp);

        
        dp[n]=0;
        for(int i=n-1;i>=0;i--)
        {
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            int c=Integer.MAX_VALUE;
            if(i+1<=n) a=costs[i]+1+dp[i+1];
            if(i+2<=n) b=costs[i+1]+4+dp[i+2];
            if(i+3<=n) c=costs[i+2]+9+dp[i+3];
            dp[i]=Math.min(Math.min(a,b),c);
        }
        return dp[0];
    }
    /**int solve(int i,int n,int costs[],int dp[])
    {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        if(i+1<=n) a=costs[i]+1+solve(i+1,n,costs,dp);
        
        if(i+2<=n)
        {
            b=costs[i+1]+4+solve(i+2,n,costs,dp);
        }
        if(i+3<=n)
        {
            c=costs[i+2]+9+solve(i+3,n,costs,dp);
        }
        return dp[i]=Math.min(Math.min(a,b),c);
    }*/
}
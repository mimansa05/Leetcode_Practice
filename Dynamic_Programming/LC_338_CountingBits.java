class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<=n;i++)
        {
            dp[i]=CountBits(i,dp);
        }
        return dp;
    }
    int CountBits(int n,int dp[])
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        dp[n]=(n%2)+CountBits(n/2,dp);
        return dp[n];
    }
}
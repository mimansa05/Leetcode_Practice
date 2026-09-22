class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,nums,dp);
    }
    int solve(int n,int[] nums,int[] dp)
    {
        if(n==0) return nums[0];
        if(n<1) return 0;
        if(dp[n]!=-1) return dp[n];
        int a=solve(n-1,nums,dp);
        int b=solve(n-2,nums,dp)+nums[n];
        return dp[n]=Math.max(a,b);

    }
}
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            int fs=dp[i-2]+nums[i];
            int ss=dp[i-1];
            dp[i]=Math.max(fs,ss);
        }
        return dp[n-1];
        
        //Arrays.fill(dp,-1);
       // return solve(n-1,nums,dp);
    }
    /**int solve(int n,int[] nums,int[] dp)
    {
        if(n==0) return nums[0];
        if(n<1) return 0;
        if(dp[n]!=-1) return dp[n];
        int a=solve(n-1,nums,dp);
        int b=solve(n-2,nums,dp)+nums[n];
        return dp[n]=Math.max(a,b);

    }*/
}
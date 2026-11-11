class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
       /**  for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(m-1,n-1,dp);*/
//tabulation
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=1;
                }
                else 
                {dp[i][j]=dp[i-1][j]+dp[i][j-1];}
            }
        }
        return dp[m-1][n-1];
    }
}
/**memoization
    int solve(int m,int n,int dp[][])
    {
        if(m<0 || n<0) return 0;
        if(m==0 && n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int up=solve(m-1,n,dp);//total ways coming from up
        int left=solve(m,n-1,dp);//total ways comin from left
        return dp[m][n]=up+left;//total will be ways coming from up+left
    }
}*/
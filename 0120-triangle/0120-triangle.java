class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        /**List<List<Integer>> dp=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                ls.add(-1);
            }
            dp.add(ls);
        }
        return solve(triangle,0,0,n-1,dp);*/
        
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++)
        {
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

       
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int a=triangle.get(i).get(j)+dp[i+1][j];
                int b=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(a,b);
            }

        }
        return dp[0][0];
    }
}
    /**int solve(List<List<Integer>> triangle,int i,int j,int n,List<List<Integer>> dp)
    {
        if(i==n) return triangle.get(i).get(j);
        //if(i>n || j>n) return 0;
        if(dp.get(i).get(j)!=-1) return dp.get(i).get(j);
        int a=triangle.get(i).get(j)+solve(triangle,i+1,j,n,dp);
        int b=triangle.get(i).get(j)+solve(triangle,i+1,j+1,n,dp);
        dp.get(i).set(j,Math.min(a,b));
        return dp.get(i).get(j);

    }
}*/
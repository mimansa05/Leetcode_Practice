import java.util.Arrays;
class LC_122_BuysSellStockII
{
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int row[]:dp) Arrays.fill(row,-1);
        return(func(0,1,n,prices,dp));
    }
    int func(int ind,int buy,int n,int[] prices,int dp[][])
    {
        int profit=0;
        if(ind==n) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy==1)
        {
            profit=Math.max(-prices[ind]+func(ind+1,0,n,prices,dp),0+func(ind+1,1,n,prices,dp));
        }
        else
        {
            profit=Math.max(prices[ind]+func(ind+1,1,n,prices,dp),0+func(ind+1,0,n,prices,dp));
        }
        dp[ind][buy]=profit;
        return profit;
    }
}
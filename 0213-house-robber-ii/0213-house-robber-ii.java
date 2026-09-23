class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
    if(n==1) return nums[0];
    //if(n==0) return 0;
      int arr1[]=new int[n-1];
      int arr2[]=new int[n-1];
      for(int i=0;i<n-1;i++)
      {
        arr1[i]=nums[i];
      }
      int j=0;
      for(int i=1;i<n;i++)
      {
        arr2[j]=nums[i];
        j++;
      }
      return Math.max(solve(arr1),solve(arr2));
    }
    int solve(int arr[])
    {
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==0) return 0;
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++)
        {
            int ps=dp[i-2]+arr[i];
            int ss=dp[i-1];
            dp[i]=Math.max(ps,ss);
        }
        return dp[n-1];
    }
}
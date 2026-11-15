class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = (int)1e9+7;

        int even = 1;
        int odd = 0;
        int sum = 0;
        int ans = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];

            if(sum%2 != 0)
            {
                ans = (ans + even)%MOD;
                odd++;
            }
            else
            {
                ans = (ans + odd)%MOD;
                even++;
            }
        }

        return ans;
    }
}
        /**int j=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++){
             sum+=arr[j];
             if(sum%2!=0)
             {
                count++;
            }
            }
        }
        return count % MOD;
        int n=arr.length;
        int dp[][]=new int[n][n];
        solve(0,0,0,arr,dp);
        return count % MOD;
    }
    void solve(int i,int j,int sum,int[] arr)
    {
        if(i==arr.length) return;
        if(j==arr.length)
        {
            solve(i+1,i+1,0,arr);
            return ;
        }
        sum+=arr[j];
        if(sum%2!=0) count++;
        solve(i,j+1,sum,arr);
    }*/

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int k = r;
        int a = 0;
        int b = 0;
        int n = nums.size();
        int sum = 0;
        int mini = Integer.MAX_VALUE;

        for(a = 0; a < n; a++)
        {
            sum = 0;
            for(b = a; b < n && (b-a+1) <= k; b++)
            {
                sum += nums.get(b);

                if((b-a+1) >= l && sum > 0)
                {
                    mini = Math.min(sum, mini);
                }
            }
        }

        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}

class LC_930_Binary_Subarray_Sum {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return cal(nums,goal)-cal(nums,goal-1); 
    }
    int cal(int [] nums,int goal)
    {
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        if(goal<0) return 0;
        while(r<nums.length)
        {
           sum+=nums[r];
           while(sum>goal)
           {
              sum-=nums[l];
              l++;
           }
           count+=r-l+1;
           r++;
        }

        return count;
    }
}
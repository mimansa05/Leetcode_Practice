class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int n:nums)
        {
            total+=n;
        }
        int target=total-x;
        if(target==0) return nums.length;
        int left=0;
        int sum=0;
        int maxi=-1;
        //int right=nums.length-1;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(left<=right && sum>target)
            {
                sum-=nums[left];
                left++;
            }
            if(sum==target)
            {
                maxi=Math.max(maxi,right-left+1);
            }
        }
        if(maxi==-1) return -1;
        return nums.length-maxi;
    }
}
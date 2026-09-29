class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return solve(0,n-1,nums,target);
    }
    int solve(int low,int high,int[] nums,int target)
    {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(target==nums[mid]) return mid;
        else if(target>nums[mid])
        {
             return solve(mid+1,high,nums,target);
        }
        else
        {
            return solve(low,mid-1,nums,target);
        }
    }
}
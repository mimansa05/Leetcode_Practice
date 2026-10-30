class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            else if(target<nums[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}
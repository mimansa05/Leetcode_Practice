class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        int maxi=nums[n-1];
        for(int x:nums)
        {
            sum+=maxi-x;
        }
        return sum;
    }
}
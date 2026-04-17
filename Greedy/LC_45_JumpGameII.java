class LC_45_JumpGameII {
    public int jump(int[] nums) {
        int n=nums.length;
        int max=0;
        int count=0;
        int end=0;
        for(int i=0;i<n-1;i++)
        {
            if(i>max) continue;
            int a=nums[i];
            max=Math.max(max,i+a);
            if(i==end)
            {
                count++;
                end=max;
            }
        }
        return count;
    }
}

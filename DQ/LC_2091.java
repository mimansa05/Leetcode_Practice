class LC_2091 {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int mini=nums[0];
        int maxi=nums[0];
        int a=0;
        int b=0;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<mini)
            {
                mini=nums[i];
                a=i;
            }
            if(nums[i]>maxi)
            {
                maxi=nums[i];
                b=i;
            }
        }
        int left=Math.max(a,b)+1;
        int right=n-Math.min(a,b);
        int both = Math.min(a, b) + 1 + n - Math.max(a, b);
        return Math.min(left, Math.min(right, both));
    }
}
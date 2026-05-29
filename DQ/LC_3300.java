class LC_3300 {
    public int minElement(int[] nums) {
       int mini=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        mini=Math.min(mini,sum(nums[i]));
       } 
       return mini;
    }
    int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n=n/10;
        }
        return s;
    }
}
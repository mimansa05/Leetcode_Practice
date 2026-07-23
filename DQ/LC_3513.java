class LC_3513 {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int m=0;
        for(int x:nums)
        {
            m|=x;
        }
        return m+1;
    }
}